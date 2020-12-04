package fi.eriran.day2;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

/**
 * Get the file from URL and split it by line breaks
 */
class LineInputParser {

    public Collection<String> parse(URL filepath) throws IOException {
        //Get file content
        String fullFileContent = Resources.toString(filepath, StandardCharsets.UTF_8);
        String[] splitByLineEscape = fullFileContent.split("\r\n");
        return Arrays.asList(splitByLineEscape);
    }
}
