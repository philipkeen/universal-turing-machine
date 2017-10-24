package machine

sealed abstract class Symbol(value: Char) {

  override def toString: String = value.toString
}

object Alphabet {

  case object O extends Symbol('0')
  case object I extends Symbol('1')
  case object Empty extends Symbol(' ')
  case object x extends Symbol('x')
  case object h extends Symbol('h')
  case object u extends Symbol('u')
  case object v extends Symbol('v')
  case object w extends Symbol('w')
  case object a extends Symbol('a')
  case object z extends Symbol('z')
  case object Tilde extends Symbol('~')
  case object Colon extends Symbol(':')
  case object Semicolon extends Symbol(';')

  def symbol(char: Char): Symbol = char match {
    case '0' => O
    case '1' => I
    case ' ' => Empty
    case '_' => Empty
    case 'x' => x
    case 'h' => h
    case 'u' => u
    case 'v' => v
    case 'w' => w
    case 'a' => a
    case 'z' => z
    case '~' => Tilde
    case ':' => Colon
    case ';' => Semicolon
  }
}

import machine.Alphabet._

case class State(value: Int) {

  override def toString: String =
    if (value < 10) s"State:   $value"
    else if (value < 100) s"State:  $value"
    else s"State: $value"
}

case class Cell(symbol: Symbol)

case class Tape(currentCell: Cell, left: Seq[Cell], right: Seq[Cell]) {

  override def toString: String = {
    val maxLeftSize = 30 - math.min(15, right.size)
    val leftView = left.slice(0, maxLeftSize)
    val leftEllipsisOrEmpty = if (left.size > maxLeftSize) "..." else "   "
    val maxRightSize = 30 - math.min(15, left.size)
    val rightView = right.slice(0, maxRightSize)
    val rightEllipsisOrEmpty = if (right.size > maxRightSize) "..." else "   "
    s" $leftEllipsisOrEmpty| ${leftView.reverse.map(_.symbol).mkString(" | ")} | ${currentCell.symbol}*| ${rightView.map(_.symbol).mkString(" | ")} |$rightEllipsisOrEmpty"
  }
}
