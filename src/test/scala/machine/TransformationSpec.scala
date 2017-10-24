package machine

import org.scalatest.FlatSpec

import scala.annotation.tailrec

class TransformationSpec extends FlatSpec {

  "Transformations" should "successfully simulate a 'write 0, move left, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('0', '0', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('0', '0', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'write 0, move right, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('0', '1', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('0', '1', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'write 1, move left, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('1', '0', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('1', '0', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'write 1, move right, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('1', '1', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('1', '1', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'delete 0, move left, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('_', '0', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('_', '0', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'delete 0, move right, finish in state 2' rule" in {
    val beginningMachine = prepareInitialMachine('_', '1', Seq('1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('_', '1', Seq('1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  it should "successfully simulate a 'write 1, move right, finish in state 3' rule" in {
    val beginningMachine = prepareInitialMachine('1', '1', Seq('1', '1', '1'))
    val finalOutput = getFinalOutput(beginningMachine, 5000)
    val expectedFinalOutput = expectedFinishedTape('1', '1', Seq('1', '1', '1'))
    assert(expectedFinalOutput == finalOutput)
  }

  private def prepareInitialMachine(write: Char, move: Char, endState: Seq[Char]) = {
    val initialTape = Seq('a') ++ getUnenrichedInitialTape(write, move, endState) ++ Seq('z')
    val enrichedInitialTape = getEnrichedSymbols(initialTape)
    Machine(enrichedInitialTape)
  }

  private def getFinalOutput(machine: Machine, maxIterations: Int) = {
    val finalMachine = getNextStep(machine, Transformations.machineAfterNextStep(machine), maxIterations, 1)
    val tape = finalMachine.tape
    tape.left.reverse ++ Seq(tape.currentCell) ++ tape.right
  }

  @tailrec
  private def getNextStep(machine: Machine, nextMachine: Machine, maxIterations: Int, currentIteration: Int): Machine =
    if (machine == nextMachine || currentIteration == maxIterations) {
      machine
    } else {
      getNextStep(nextMachine, Transformations.machineAfterNextStep(nextMachine), maxIterations, currentIteration + 1)
    }

  private def expectedFinishedTape(write: Char, move: Char, endState: Seq[Char]) = {
    val initialTape = getUnenrichedInitialTape(write, move, endState)
    val step0 = Seq(':', '1', ':', '_', '0', '_')
    val step1 =
      if (move == '0') {
        Seq(':') ++ endState ++ Seq(':', '_', '_', write, '_')
      } else {
        Seq(':') ++ endState ++ Seq(':', write, '_', '_')
      }
    val finishedSymbols = getEnrichedSymbols(Seq('a') ++ initialTape ++ step0 ++ step1 ++ Seq('z'))
    finishedSymbols map { char =>
      val symbol = Alphabet.symbol(char)
      Cell(symbol)
    }
  }

  private def getUnenrichedInitialTape(write: Char, move: Char, endState: Seq[Char]) = {
    val initialInstruction = Seq(';', '1', ':', '0', ':', write, ':', move, ':') ++ endState
    val initialInput = Seq('0')
    initialInstruction ++ Seq('~') ++ initialInput
  }

  private def getEnrichedSymbols(symbolSeq: Seq[Char]) =
    symbolSeq flatMap {c =>
      c match {
        case 'a' => Seq('a', 'a')
        case 'z' => Seq('z', 'z')
        case s => Seq(s, '_')
      }
    }
}
