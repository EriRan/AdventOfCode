package fi.eriran.day9;

import fi.eriran.common.parser.LongInputParserProxy;
import fi.eriran.day9.calculation.InvalidNumberFinder;
import fi.eriran.day9.constant.PreambleConstant;
import fi.eriran.day9.parser.PreambleContainerFactory;

public class EncodingErrorMain {

    public static void main(String[] args) {
        System.out.println("Part one first invalid number: " +
                new InvalidNumberFinder().find(
                        new PreambleContainerFactory().parser(
                                new LongInputParserProxy().parse("Day9Input"),
                                PreambleConstant.PART_ONE_PREAMBLE_SIZE
                        )
                )
        );
    }
}
