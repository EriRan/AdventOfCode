package fi.eriran._2020.day13.calculation.sequential;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day13.parser.TimetableParser;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequentialBuslinesFinderTest {

    @Test
    void simpleBuslines() {
        assertEquals(
                1,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("1,2,3")
                        )
                )
        );
    }

    @Test
    void furtherSimpleBuslines() {
        assertEquals(
                4,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("4,5,6")
                        )
                )
        );
    }

    /**
     * The example that uses the test data
     */
    @Test
    void exampleOne() {
        assertEquals(
                1068781,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                new MultiLineInputParserProxy().parse("2020/Day13TestInput")
                        )
                )
        );
    }

    /**
     * Examples below are from the additional examples
     */
    @Test
    void exampleTwo() {
        assertEquals(
                3417,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("17,x,13,19")
                        )
                )
        );
    }

    @Test
    void exampleThree() {
        assertEquals(
                754018,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("67,7,59,61")
                        )
                )
        );
    }

    @Test
    void exampleFour() {
        assertEquals(
                779210,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("67,x,7,59,61")
                        )
                )
        );
    }

    @Test
    void exampleFive() {
        assertEquals(
                1261476,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("67,7,x,59,61")
                        )
                )
        );
    }

    @Test
    void exampleSix() {
        assertEquals(
                1202161486,
                new SequentialBuslinesFinder().find(
                        new TimetableParser().parse(
                                createTestTimetable("1789,37,47,1889")
                        )
                )
        );
    }

    private List<String> createTestTimetable(String buslines) {
        return Arrays.asList(
                "123",//The irrelevant to part two line
                buslines
        );
    }
}