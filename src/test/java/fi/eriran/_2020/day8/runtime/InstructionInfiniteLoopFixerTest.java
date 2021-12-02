package fi.eriran._2020.day8.runtime;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran._2020.day8.parser.InstructionParser;
import fi.eriran._2020.day8.pojo.InstructionRunnerResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionInfiniteLoopFixerTest {

    @Test
    void example() {
        InstructionRunnerResponse runnerResponse = new InstructionInfiniteLoopFixer().fix(
                new InstructionParser().parse(new LineInputParserProxy().parse("Day8TestInput"))
        );
        assertNotNull(runnerResponse);
        assertFalse(runnerResponse.isRanIntoInfiniteLoop());
        assertEquals(
                8,
                runnerResponse.getFinalAccumulatorValue()
        );
    }
}