package fi.eriran.common.parser;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class NumberInputParserProxy extends AbstractInputParserProxy<Integer>{

    public NumberInputParserProxy() {
        super(new NumberInputParser());
    }
}
