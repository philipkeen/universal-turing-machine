package machine

import machine.Alphabet.Empty

case class Machine(tape: Tape, state: State) {

  override def toString: String = s"[$state] $tape"
}

object Machine {

  def apply(input: Seq[Char]): Machine = {
    val initialCells = input
      .map(char => Alphabet.symbol(char))
      .map(symbol => Cell(symbol))
    val tape = initialCells match {
      case cellSeq if cellSeq.isEmpty => Tape(Cell(Empty), Seq(Cell(Empty)), Seq(Cell(Empty)))
      case cellSeq => Tape(cellSeq.head, Seq(Cell(Empty)), cellSeq.tail)
    }
    Machine(tape, State(1))
  }
}
