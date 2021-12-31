package fi.eriran._2020.day4.processor;

import fi.eriran.common.parser.multiline.LineInputParserProxy;
import fi.eriran._2020.day4.processor.parser.PassportMapper;
import fi.eriran._2020.day4.processor.validator.PartOnePassportValidator;
import fi.eriran._2020.day4.processor.validator.ValidPassportCounter;

public class PartOnePassportProcessor implements PassportProcessor {

    public long process(String resorceFolderFilename) {
        return new ValidPassportCounter(new PartOnePassportValidator()).count(
                new PassportMapper().map(
                        new LineInputParserProxy().parse(resorceFolderFilename)
                )
        );
    }
}
