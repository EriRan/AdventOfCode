package fi.eriran.common.parser.multiline;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class IntegerMultiLineInputParserProxy extends AbstractMultiLineInputParserProxy<Integer>{

    public IntegerMultiLineInputParserProxy() {
        super(new IntegerMultiLineInputParser());
    }
}
