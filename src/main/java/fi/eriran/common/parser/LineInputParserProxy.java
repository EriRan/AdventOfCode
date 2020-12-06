package fi.eriran.common.parser;

import fi.eriran.common.file.FileContentFetcher;

import java.io.IOException;
import java.util.List;

/**
 * Get the file from URL and split it by line breaks
 */
public class LineInputParserProxy {

    private final LineInputParser lineInputParser;
    private final FileContentFetcher fileContentFetcher;

    public LineInputParserProxy() {
        lineInputParser = new LineInputParser();
        fileContentFetcher = new FileContentFetcher();
    }

    public List<String> parse(String resourceFolderFileName) throws IOException {
        return lineInputParser.parse(fileContentFetcher.fetch(resourceFolderFileName));
    }
}
