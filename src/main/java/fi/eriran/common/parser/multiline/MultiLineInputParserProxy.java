package fi.eriran.common.parser.multiline;

/**
 * Get the file from URL and split it by line breaks
 */
public class MultiLineInputParserProxy extends AbstractMultiLineInputParserProxy<String> {

    public MultiLineInputParserProxy() {
        super(new LineMultiLineInputParser());
    }
}
