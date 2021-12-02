package fi.eriran.twozerotwozero.day8.parser;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day8.pojo.Instruction;
import fi.eriran.twozerotwozero.day8.pojo.Operation;
import fi.eriran.testcommon.util.Outboxer;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstructionParserTest {

    @Test
    void buildExample() {
        List<Instruction> instructions = new InstructionParser()
                .parse(new LineInputParserProxy().parse("Day8TestInput"));
        assertFalse(CollectionUtils.isEmpty(instructions));
        assertEquals(9, instructions.size());
        instructions.forEach(instruction -> assertNotNull(instruction.getOperation()));
    }

    @Test
    void parseNegativeArgument() {
        List<Instruction> instructions = new InstructionParser().parse(Collections.singletonList("acc -99"));
        assertFalse(CollectionUtils.isEmpty(instructions));
        assertEquals(1, instructions.size());

        Instruction firstInstruction = Outboxer.getFirst(instructions);
        assertEquals(Operation.ACCUMULATOR, firstInstruction.getOperation());
        assertEquals(-99, firstInstruction.getArgument());
    }

    @Test
    void parsePositiveArgument() {
        List<Instruction> instructions = new InstructionParser().parse(Collections.singletonList("jmp 123"));
        assertFalse(CollectionUtils.isEmpty(instructions));
        assertEquals(1, instructions.size());

        Instruction firstInstruction = Outboxer.getFirst(instructions);
        assertEquals(Operation.JUMP, firstInstruction.getOperation());
        assertEquals(123, firstInstruction.getArgument());
    }
}