package fi.eriran.day8.pojo;

public class Instruction {

    //This needs to be changed during part 2 so it can't be final
    private Operation operation;
    private final int argument;
    private boolean isExecutedBefore;

    public Instruction(Operation operation, int argument) {
        this.operation = operation;
        this.argument = argument;
        this.isExecutedBefore = false;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int getArgument() {
        return argument;
    }

    public boolean isExecutedBefore() {
        return isExecutedBefore;
    }

    public void setExecutedBefore(boolean executedBefore) {
        isExecutedBefore = executedBefore;
    }
}
