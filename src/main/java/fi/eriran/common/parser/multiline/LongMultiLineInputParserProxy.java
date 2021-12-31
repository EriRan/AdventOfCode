package fi.eriran.common.parser.multiline;

public class LongMultiLineInputParserProxy extends AbstractMultiLineInputParserProxy<Long> {

    public LongMultiLineInputParserProxy() {
        super(new LongMultiLineInputParser());
    }

}
