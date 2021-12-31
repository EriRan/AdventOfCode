package fi.eriran.common.parser;

import java.util.List;

public abstract class AbstractOneLineInputParserProxy<T> extends AbstractInputParserProxy {

    private final OneLineInputParser<T> concreteParser;

    protected AbstractOneLineInputParserProxy(OneLineInputParser<T> concreteParser) {
        super();
        this.concreteParser = concreteParser;
    }

    public List<T> parse(String resourceFolderFileName, String splitRegex) {
        return getConcreteParser().parse(getFileContentFetcher().fetch(resourceFolderFileName), splitRegex);
    }

    protected OneLineInputParser<T> getConcreteParser() {
        return concreteParser;
    }
}
