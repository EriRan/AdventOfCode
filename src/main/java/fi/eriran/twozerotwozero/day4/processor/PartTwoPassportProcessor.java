package fi.eriran.twozerotwozero.day4.processor;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day4.processor.parser.PassportMapper;
import fi.eriran.twozerotwozero.day4.processor.validator.PartTwoPassportValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.ValidPassportCounter;

public class PartTwoPassportProcessor implements PassportProcessor {
    @Override
    public long process(String resorceFolderFilename) {
        return new ValidPassportCounter(new PartTwoPassportValidator()).count(
                new PassportMapper().map(
                        new LineInputParserProxy().parse(resorceFolderFilename)
                )
        );
    }
}
