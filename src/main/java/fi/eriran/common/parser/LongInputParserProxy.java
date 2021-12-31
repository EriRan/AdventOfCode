package fi.eriran.common.parser;

public class LongInputParserProxy extends AbstractMultiLineInputParserProxy<Long> {

    public LongInputParserProxy() {
        super(new LongMultiLineInputParser());
    }

}
