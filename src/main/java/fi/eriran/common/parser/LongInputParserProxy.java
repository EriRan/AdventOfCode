package fi.eriran.common.parser;

public class LongInputParserProxy extends AbstractInputParserProxy<Long> {

    public LongInputParserProxy() {
        super(new LongInputParser());
    }

}
