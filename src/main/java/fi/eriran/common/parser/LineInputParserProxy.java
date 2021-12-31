package fi.eriran.common.parser;

/**
 * Get the file from URL and split it by line breaks
 */
public class LineInputParserProxy extends AbstractMultiLineInputParserProxy<String> {

    public LineInputParserProxy() {
        super(new LineMultiLineInputParser());
    }
}
