package fi.eriran.day4;

import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day4.parser.PassportMapper;
import fi.eriran.day4.validator.ValidPassportCounter;

import java.io.IOException;
import java.net.URL;

public class PassportProcessor {

    public long process(URL filepath) throws IOException {
        return new ValidPassportCounter().count(
                new PassportMapper().map(
                        new LineInputParser().parse(filepath)
                )
        );
    }
}
