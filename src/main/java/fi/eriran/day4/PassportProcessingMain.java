package fi.eriran.day4;

import com.google.common.io.Resources;
import fi.eriran.day4.processor.PassportProcessor;

import java.io.IOException;

public class PassportProcessingMain {

    public static void main(String[] args) throws IOException {
        System.out.println(
                "Valid passports: "
                        + new PassportProcessor().process(Resources.getResource("day4Input"))
        );
    }
}
