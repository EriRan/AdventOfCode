package fi.eriran.day8.parser;

import fi.eriran.day8.pojo.Operation;

public class OperationStringToEnumConverter {

    private OperationStringToEnumConverter() {
    }

    public static Operation convert(String operationString) {
        switch (operationString) {
            case "acc":
                return Operation.ACCUMULATOR;
            case "jmp":
                return Operation.JUMP;
            case "nop":
                return Operation.NO_OPERATION;
            default:
                throw new IllegalArgumentException("Unkown operation String: " + operationString);
        }
    }
}
