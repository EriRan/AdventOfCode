package fi.eriran.common.parser;

import com.google.common.io.Resources;
import fi.eriran.common.parser.exception.InputParserException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Get the contents of a file in a String using {@link com.google.common.io.Resources}
 */
public class FileContentFetcher {

    public String fetch(String resourceFolderFileName) {
        try {
            return Resources.toString(Resources.getResource(resourceFolderFileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new InputParserException(e);
        }

    }
}
