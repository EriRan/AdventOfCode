package fi.eriran.common.parser;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class IntegerInputParserProxy extends AbstractInputParserProxy<Integer>{

    public IntegerInputParserProxy() {
        super(new IntegerInputParser());
    }
}
