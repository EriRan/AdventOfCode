package fi.eriran.common.parser;

import com.google.common.io.Resources;
import fi.eriran.common.parser.constant.ParserConstant;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

class LineInputParser {

    public List<String> parse(URL filepath) throws IOException {
        //Get file content
        String fullFileContent = Resources.toString(filepath, StandardCharsets.UTF_8);
        String[] splitByLineEscape = fullFileContent.split(ParserConstant.WINDOWS_LINE_BREAK);
        return Arrays.asList(splitByLineEscape);
    }
}
