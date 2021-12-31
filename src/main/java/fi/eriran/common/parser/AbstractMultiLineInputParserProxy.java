package fi.eriran.common.parser;

import java.util.List;

public abstract class AbstractMultiLineInputParserProxy<T> extends AbstractInputParserProxy {

    private final MultiLineInputParser<T> concreteParser;

    protected AbstractMultiLineInputParserProxy(MultiLineInputParser<T> concreteParser) {
        super();
        this.concreteParser = concreteParser;
    }

    public List<T> parse(String resourceFolderFileName) {
        return getConcreteParser().parse(getFileContentFetcher().fetch(resourceFolderFileName));
    }

    protected MultiLineInputParser<T> getConcreteParser() {
        return concreteParser;
    }
}
