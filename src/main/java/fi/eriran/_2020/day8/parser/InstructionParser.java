package fi.eriran._2020.day8.parser;

import fi.eriran._2020.day8.pojo.Instruction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InstructionParser {

    public List<Instruction> parse(Collection<String> lines) {
        List<Instruction> instructions = new ArrayList<>();
        lines.forEach(line -> instructions.add(parseOne(line)));
        return instructions;
    }

    private Instruction parseOne(String line) {
        String[] splitLine = line.split(" ");
        //First one is a command
        return new Instruction(
                OperationStringToEnumConverter.convert(splitLine[0]),
                createArgument(splitLine[1])
        );
    }

    private int createArgument(String string) {
        return Integer.parseInt(string);
    }
}
