package fi.eriran.twozerotwozero.day8.runtime;

import fi.eriran.twozerotwozero.day8.pojo.Instruction;
import fi.eriran.twozerotwozero.day8.pojo.InstructionRunnerResponse;
import fi.eriran.twozerotwozero.day8.pojo.Operation;

import java.util.List;

public class InstructionInfiniteLoopFixer {

    private final InstructionRunner instructionRunner;

    public InstructionInfiniteLoopFixer() {
        instructionRunner = new InstructionRunner();
    }

    public InstructionRunnerResponse fix(List<Instruction> instructions) {
        for (int i = 0; i < instructions.size(); i++) {
            Instruction currentInstruction = instructions.get(i);
            switch (currentInstruction.getOperation()) {
                case ACCUMULATOR:
                    //Do nothing
                    break;
                case JUMP:
                    //Change jump command to no operation temporarily
                    currentInstruction.setOperation(Operation.NO_OPERATION);
                    InstructionRunnerResponse jumpChangeResponse = instructionRunner
                            .findAccumulatorValueAtInfiniteLoop(instructions);
                    if (!jumpChangeResponse.isRanIntoInfiniteLoop()) {
                        return jumpChangeResponse;
                    }
                    //Change the command back to what it was
                    currentInstruction.setOperation(Operation.JUMP);
                    break;
                case NO_OPERATION:
                    //Change no operation command to no operation temporarily
                    currentInstruction.setOperation(Operation.JUMP);
                    InstructionRunnerResponse noOperationChangeResponse = instructionRunner
                            .findAccumulatorValueAtInfiniteLoop(instructions);
                    if (!noOperationChangeResponse.isRanIntoInfiniteLoop()) {
                        return noOperationChangeResponse;
                    }
                    //Change the command back to what it was
                    currentInstruction.setOperation(Operation.NO_OPERATION);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation encountered: "
                            + currentInstruction.getOperation());
            }
            resetIsExecutedBefore(instructions);
        }
        throw new IllegalStateException("Unable to fix the instructions!");
    }

    private void resetIsExecutedBefore(List<Instruction> instructions) {
        instructions.forEach(instruction -> instruction.setExecutedBefore(false));
    }
}
