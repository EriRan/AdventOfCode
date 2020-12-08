package fi.eriran.day8.runtime;

import fi.eriran.day8.pojo.Instruction;
import fi.eriran.day8.pojo.InstructionRunnerResponse;

import java.util.List;

public class InstructionRunner {

    public InstructionRunnerResponse findAccumulatorValueAtInfiniteLoop(List<Instruction> instructions) {
        int accumulatorValue = 0;
        int currentIndex = 0;
        while (currentIndex < instructions.size()) {
            Instruction currentCommand = instructions.get(currentIndex);
            if (currentCommand.isExecutedBefore()) {
                return new InstructionRunnerResponse(accumulatorValue, true);
            }
            currentCommand.setExecutedBefore(true);
            switch (currentCommand.getOperation()) {
                case ACCUMULATOR:
                    accumulatorValue += currentCommand.getArgument();
                    currentIndex++;
                    break;
                case JUMP:
                    currentIndex += currentCommand.getArgument();
                    break;
                case NO_OPERATION:
                    currentIndex++;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown command encountered: " + currentCommand.getOperation());
            }
        }
        return new InstructionRunnerResponse(accumulatorValue, false);
    }
}
