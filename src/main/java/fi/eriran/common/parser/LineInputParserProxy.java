package fi.eriran.common.parser;

import com.google.common.io.Resources;

import java.io.IOException;
import java.util.List;

/**
 * Get the file from URL and split it by line breaks
 */
public class LineInputParserProxy {

    private final LineInputParser lineInputParser;

    public LineInputParserProxy() {
        lineInputParser = new LineInputParser();
    }

    public List<String> parse(String resourceFolderFileName) throws IOException {
        return lineInputParser.parse(Resources.getResource(resourceFolderFileName));
    }
}
