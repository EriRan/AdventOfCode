package fi.eriran.common.parser;

import com.google.common.io.Resources;

import java.io.IOException;
import java.util.List;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class NumberInputParserProxy {

    private final NumberInputParser numberInputParser;

    public NumberInputParserProxy() {
        numberInputParser = new NumberInputParser();
    }

    public List<Integer> parse(String resourceFolderFileName) throws IOException {
        return numberInputParser.parse(Resources.getResource(resourceFolderFileName));
    }
}
