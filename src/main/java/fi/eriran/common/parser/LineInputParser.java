package fi.eriran.common.parser;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * Get the file from URL and split it by line breaks
 */
public class LineInputParser {

    public List<String> parse(URL filepath) throws IOException {
        //Get file content
        String fullFileContent = Resources.toString(filepath, StandardCharsets.UTF_8);
        String[] splitByLineEscape = fullFileContent.split("\r\n");
        return Arrays.asList(splitByLineEscape);
    }
}
