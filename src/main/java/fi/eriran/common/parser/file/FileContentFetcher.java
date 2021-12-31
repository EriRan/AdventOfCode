package fi.eriran.common.parser.file;

import com.google.common.io.Resources;
import fi.eriran.common.parser.exception.InputParserException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Get the contents of a file in a String using {@link com.google.common.io.Resources}
 */
public class FileContentFetcher {

    /**
     * Get a file and turn its contents into a String
     * @param resourceFolderFileName filepath of a file to be fetched
     * @return Contentes of the file in a String
     */
    public String fetch(String resourceFolderFileName) {
        try {
            return Resources.toString(Resources.getResource(resourceFolderFileName), StandardCharsets.UTF_8);
        } catch (IOException | IllegalArgumentException e) {
            throw new InputParserException(e);
        }

    }
}
