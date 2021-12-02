package fi.eriran.twozerotwozero.day8;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day8.parser.InstructionParser;
import fi.eriran.twozerotwozero.day8.pojo.Instruction;
import fi.eriran.twozerotwozero.day8.runtime.InstructionInfiniteLoopFixer;
import fi.eriran.twozerotwozero.day8.runtime.InstructionRunner;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandheldHaltingMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Instruction> instructions = new InstructionParser().parse(
                new LineInputParserProxy().parse("2020/day8Input")
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
