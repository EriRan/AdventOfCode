package fi.eriran.common.parser.multiline;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class IntegerInputParserProxy extends AbstractMultiLineInputParserProxy<Integer>{

    public IntegerInputParserProxy() {
        super(new IntegerMultiLineInputParser());
    }
}
