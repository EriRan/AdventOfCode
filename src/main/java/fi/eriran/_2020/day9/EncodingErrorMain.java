package fi.eriran._2020.day9;

import fi.eriran.common.parser.LongInputParserProxy;
import fi.eriran._2020.day9.calculation.InvalidNumberFinder;
import fi.eriran._2020.day9.calculation.weakness.EncryptionWeaknessFinder;
import fi.eriran._2020.day9.constant.PreambleConstant;
import fi.eriran._2020.day9.parser.PreambleContainerFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EncodingErrorMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one first invalid number: " +
                        new InvalidNumberFinder().find(
                                new PreambleContainerFactory().parser(
                                        new LongInputParserProxy().parse("2020/day9"),
                                        PreambleConstant.PART_ONE_PREAMBLE_SIZE
                                )
                        )
        );
        logger.log(
                Level.INFO,
                () -> "Part two encryption weakness: " +
                        new EncryptionWeaknessFinder().find(
                                new PreambleContainerFactory().parser(
                                        new LongInputParserProxy().parse("2020/day9"),
                                        PreambleConstant.PART_ONE_PREAMBLE_SIZE
                                )
                        )
        );
    }
}
