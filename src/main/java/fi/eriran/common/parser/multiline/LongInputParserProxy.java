package fi.eriran.common.parser.multiline;

public class LongInputParserProxy extends AbstractMultiLineInputParserProxy<Long> {

    public LongInputParserProxy() {
        super(new LongMultiLineInputParser());
    }

}
