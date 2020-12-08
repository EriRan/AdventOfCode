package fi.eriran.common.parser;

import fi.eriran.common.file.FileContentFetcher;

import java.util.List;

public abstract class AbstractInputParserProxy<T> {

    private final InputParser<T> concreteParser;
    private final FileContentFetcher fileContentFetcher;

    protected AbstractInputParserProxy(InputParser<T> concreteParser) {
        this.concreteParser = concreteParser;
        fileContentFetcher = new FileContentFetcher();
    }

    public List<T> parse(String resourceFolderFileName) {
        return getConcreteParser().parse(getFileContentFetcher().fetch(resourceFolderFileName));
    }

    protected InputParser<T> getConcreteParser() {
        return concreteParser;
    }

    protected FileContentFetcher getFileContentFetcher() {
        return fileContentFetcher;
    }
}
