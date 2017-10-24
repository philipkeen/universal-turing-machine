import machine.{Machine, Transformation, Transformations}

import scala.annotation.tailrec

object Main {

  def main(args: Array[String]): Unit = {
    val instructions = args(0).toCharArray.toSeq
    val input = args(1).toCharArray.toSeq
    val initialTape = Seq('a') ++ instructions ++ Seq('~') ++ input ++ Seq('z')
    val enrichedInitialTape = initialTape flatMap {c =>
      c match {
        case 'a' => Seq('a', 'a')
        case 'z' => Seq('z', 'z')
        case s => Seq(s, '_')
      }
    }
    val machine = Machine(enrichedInitialTape)
    printMachine(machine, Transformations.machineAfterNextStep(machine))
  }

  @tailrec
  private def printMachine(machine: Machine, nextMachine: Machine): Unit = {
    println(machine)
    if (nextMachine != machine) {
      printMachine(nextMachine, Transformations.machineAfterNextStep(nextMachine))
    }
  }
}
