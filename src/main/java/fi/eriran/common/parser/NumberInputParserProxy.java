package fi.eriran.common.parser;

import fi.eriran.common.file.FileContentFetcher;

import java.io.IOException;
import java.util.List;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class NumberInputParserProxy {

    private final NumberInputParser numberInputParser;
    private final FileContentFetcher fileContentFetcher;

    public NumberInputParserProxy() {
        numberInputParser = new NumberInputParser();
        fileContentFetcher = new FileContentFetcher();
    }

    public List<Integer> parse(String resourceFolderFileName) throws IOException {
        return numberInputParser.parse(fileContentFetcher.fetch(resourceFolderFileName));
    }
}
