package fi.eriran.day8.pojo;

public class Instruction {

    private final Operation operation;
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
