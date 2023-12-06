package fi.eriran._2023.day1;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrebuchetTaskTwoTest {

    private TrebuchetTaskTwo trebuchetTaskTwo = new TrebuchetTaskTwo();


    @Test
    void exampleCase() {
        List<String> input = new MultiLineInputParserProxy().parse("2023/day1task2");
        assertEquals(281, trebuchetTaskTwo.findSum(input));
    }
}