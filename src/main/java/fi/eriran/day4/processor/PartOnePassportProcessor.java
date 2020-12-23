package fi.eriran.day4.processor;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day4.processor.parser.PassportMapper;
import fi.eriran.day4.processor.validator.PartOnePassportValidator;
import fi.eriran.day4.processor.validator.ValidPassportCounter;

public class PartOnePassportProcessor implements PassportProcessor {

    public long process(String resorceFolderFilename) {
        return new ValidPassportCounter(new PartOnePassportValidator()).count(
                new PassportMapper().map(
                        new LineInputParserProxy().parse(resorceFolderFilename)
                )
        );
    }
}
