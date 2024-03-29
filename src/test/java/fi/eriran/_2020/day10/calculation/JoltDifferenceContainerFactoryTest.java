package fi.eriran._2020.day10.calculation;

import fi.eriran.common.parser.multiline.IntegerMultiLineInputParserProxy;
import fi.eriran._2020.day10.pojo.JoltDifferencesContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoltDifferenceContainerFactoryTest {

    @Test
    void example() {
        JoltDifferencesContainer differencesContainer = new JoltDifferenceContainerFactory().find(
                new IntegerMultiLineInputParserProxy().parse("2020/Day10TestInput")
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