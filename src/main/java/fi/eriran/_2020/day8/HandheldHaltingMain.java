package fi.eriran._2020.day8;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day8.parser.InstructionParser;
import fi.eriran._2020.day8.pojo.Instruction;
import fi.eriran._2020.day8.runtime.InstructionInfiniteLoopFixer;
import fi.eriran._2020.day8.runtime.InstructionRunner;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandheldHaltingMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Instruction> instructions = new InstructionParser().parse(
                new MultiLineInputParserProxy().parse("2020/day8")
        );
        logger.log(
                Level.INFO,
                () -> "Part one accumulator at infinite loop start: "
                        + new InstructionRunner()
                        .findAccumulatorValueAtInfiniteLoop(instructions)
                        .getFinalAccumulatorValue()
        );
        logger.log(
                Level.INFO,
                () -> "Part two accumulator at fixed infinite loop end: "
                        + new InstructionInfiniteLoopFixer()
                        .fix(instructions)
                        .getFinalAccumulatorValue()
        );
    }
}
