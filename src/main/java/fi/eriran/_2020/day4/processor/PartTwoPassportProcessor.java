package fi.eriran._2020.day4.processor;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day4.processor.parser.PassportMapper;
import fi.eriran._2020.day4.processor.validator.PartTwoPassportValidator;
import fi.eriran._2020.day4.processor.validator.ValidPassportCounter;

public class PartTwoPassportProcessor implements PassportProcessor {
    @Override
    public long process(String resorceFolderFilename) {
        return new ValidPassportCounter(new PartTwoPassportValidator()).count(
                new PassportMapper().map(
                        new MultiLineInputParserProxy().parse(resorceFolderFilename)
                )
        );
    }
}
