package fi.eriran.common.parser;

import fi.eriran.common.parser.file.FileContentFetcher;

public abstract class AbstractInputParserProxy {


    private final FileContentFetcher fileContentFetcher;

    protected AbstractInputParserProxy() {
        this.fileContentFetcher = new FileContentFetcher();
    }

    protected FileContentFetcher getFileContentFetcher() {
        return fileContentFetcher;
    }
}
