package fi.eriran.common.parser;

import java.util.List;

/**
 * Get the file from URL and split it by line breaks
 */
public class LineInputParserProxy extends AbstractInputParserProxy<String> {

    public LineInputParserProxy() {
        super(new LineInputParser());
    }

    @Override
    public List<String> parse(String resourceFolderFileName) {
        return getConcreteParser().parse(getFileContentFetcher().fetch(resourceFolderFileName));
    }
}
