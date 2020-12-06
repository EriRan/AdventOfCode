package fi.eriran.common.parser;

import fi.eriran.common.file.FileContentFetcher;

import java.io.IOException;
import java.util.List;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
public class NumberInputParserProxy extends AbstractInputParserProxy<Integer>{

    public NumberInputParserProxy() {
        super(new NumberInputParser());
    }

    public List<Integer> parse(String resourceFolderFileName) {
        return getConcreteParser().parse(getFileContentFetcher().fetch(resourceFolderFileName));
    }
}
