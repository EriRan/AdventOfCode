package fi.eriran.day4.processor;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day4.processor.parser.PassportMapper;
import fi.eriran.day4.processor.validator.PartTwoPassportValidator;
import fi.eriran.day4.processor.validator.ValidPassportCounter;

import java.io.IOException;

public class PartTwoPassportProcessor implements PassportProcessor {
    @Override
    public long process(String resorceFolderFilename) throws IOException {
        return new ValidPassportCounter(new PartTwoPassportValidator()).count(
                new PassportMapper().map(
                        new LineInputParserProxy().parse(resorceFolderFilename)
                )
        );
    }
}
