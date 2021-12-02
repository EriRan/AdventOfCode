package fi.eriran._2020.day4;

import fi.eriran._2020.day4.processor.PartOnePassportProcessor;
import fi.eriran._2020.day4.processor.PartTwoPassportProcessor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PassportProcessingMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one Valid passports: "
                        + new PartOnePassportProcessor().process("2020/day4Input")
        );
        logger.log(
                Level.INFO,
                () -> "Part two Valid passports: "
                        + new PartTwoPassportProcessor().process("2020/day4Input")
        );
    }
}
