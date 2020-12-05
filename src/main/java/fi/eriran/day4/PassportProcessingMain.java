package fi.eriran.day4;

import com.google.common.io.Resources;
import fi.eriran.day4.processor.PartOnePassportProcessor;
import fi.eriran.day4.processor.PartTwoPassportProcessor;

import java.io.IOException;

public class PassportProcessingMain {

    public static void main(String[] args) throws IOException {
        System.out.println(
                "Part one Valid passports: "
                        + new PartOnePassportProcessor().process(Resources.getResource("day4Input"))
        );

        System.out.println(
                "Part two Valid passports: "
                        + new PartTwoPassportProcessor().process(Resources.getResource("day4Input"))
        );
    }
}
