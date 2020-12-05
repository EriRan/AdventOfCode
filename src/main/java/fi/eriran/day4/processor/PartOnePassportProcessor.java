package fi.eriran.day4.processor;

import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day4.processor.parser.PassportMapper;
import fi.eriran.day4.processor.validator.PartOnePassportValidator;
import fi.eriran.day4.processor.validator.ValidPassportCounter;

import java.io.IOException;
import java.net.URL;

public class PartOnePassportProcessor implements PassportProcessor {

    public long process(URL filepath) throws IOException {
        return new ValidPassportCounter(new PartOnePassportValidator()).count(
                new PassportMapper().map(
                        new LineInputParser().parse(filepath)
                )
        );
    }
}
