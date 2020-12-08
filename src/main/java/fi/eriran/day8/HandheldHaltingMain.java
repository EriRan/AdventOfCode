package fi.eriran.day8;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day8.parser.InstructionParser;
import fi.eriran.day8.pojo.Instruction;
import fi.eriran.day8.runtime.InstructionInfiniteLoopFixer;
import fi.eriran.day8.runtime.InstructionRunner;

import java.util.List;

public class HandheldHaltingMain {

    public static void main(String[] args) {
        List<Instruction> instructions = new InstructionParser().parse(
                new LineInputParserProxy().parse("day8Input")
        );
        System.out.println("Part one accumulator at infinite loop start: "
                + new InstructionRunner()
                .findAccumulatorValueAtInfiniteLoop(instructions)
                .getFinalAccumulatorValue()
        );
        System.out.println("Part two accumulator at fixed infinite loop end: "
                + new InstructionInfiniteLoopFixer()
                .fix(instructions)
                .getFinalAccumulatorValue()
        );
    }
}
