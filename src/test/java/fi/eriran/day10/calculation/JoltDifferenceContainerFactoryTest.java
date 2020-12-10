package fi.eriran.day10.calculation;

import fi.eriran.common.parser.IntegerInputParserProxy;
import fi.eriran.day10.pojo.JoltDifferencesContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoltDifferenceContainerFactoryTest {

    @Test
    void example() {
        JoltDifferencesContainer differencesContainer = new JoltDifferenceContainerFactory().find(
                new IntegerInputParserProxy().parse("Day10TestInput")
        );
        assertEquals(
                22,
                differencesContainer.getOneJolts()
        );
        assertEquals(
                10,
                differencesContainer.getThreeJolts()
        );
    }
}