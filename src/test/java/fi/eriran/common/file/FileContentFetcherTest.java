package fi.eriran.common.file;

import fi.eriran.common.parser.exception.InputParserException;
import fi.eriran.common.parser.file.FileContentFetcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileContentFetcherTest {

    private final FileContentFetcher fileContentFetcher = new FileContentFetcher();

    @Test
    void successfulFileFetch() {
        String content = fileContentFetcher.fetch("common/testInput");
        assertEquals("Hello World", content);
    }

    @Test
    void errorWhenFileDoesNotExist() {
        try {
            fileContentFetcher.fetch("NOTHING");
            Assertions.fail("Exception not thrown!");
        } catch (InputParserException e) {
            assertNotNull(e);
        } catch (Exception e) {
            Assertions.fail("Unexpected exception:" + e);
        }
    }
}