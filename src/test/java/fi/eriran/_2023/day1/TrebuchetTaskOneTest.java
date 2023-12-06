package fi.eriran._2023.day1;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrebuchetTaskOneTest {

    private TrebuchetTaskOne trebuchetTaskOne = new TrebuchetTaskOne();


    @Test
    void exampleCase() {
        List<String> input = new MultiLineInputParserProxy().parse("2023/day1");
        assertEquals(142, trebuchetTaskOne.findSum(input));
    }
}