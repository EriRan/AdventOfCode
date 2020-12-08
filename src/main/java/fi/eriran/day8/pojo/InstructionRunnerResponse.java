package fi.eriran.day8.pojo;

public class InstructionRunnerResponse {

    private final int finalAccumulatorValue;
    private final boolean ranIntoInfiniteLoop;

    public InstructionRunnerResponse(int finalAccumulatorValue, boolean ranIntoInfiniteLoop) {
        this.finalAccumulatorValue = finalAccumulatorValue;
        this.ranIntoInfiniteLoop = ranIntoInfiniteLoop;
    }

    public int getFinalAccumulatorValue() {
        return finalAccumulatorValue;
    }

    public boolean isRanIntoInfiniteLoop() {
        return ranIntoInfiniteLoop;
    }
}
