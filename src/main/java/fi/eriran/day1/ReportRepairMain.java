package fi.eriran.day1;

import fi.eriran.common.parser.NumberInputParserProxy;

import java.io.IOException;
import java.util.List;

public class ReportRepairMain {

    public static void main(String[] args) throws IOException {
        List<Integer> input = new NumberInputParserProxy().parse("day1Input");
        System.out.println("Part One: " + new ReportRepairerTwoPair().repair(input));
        System.out.println("Part two: " + new ReportRepairerThreePair().repair(input));
    }
}
