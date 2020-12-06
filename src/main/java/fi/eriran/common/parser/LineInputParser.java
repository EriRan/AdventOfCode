package fi.eriran.common.parser;

import fi.eriran.common.parser.constant.ParserConstant;

import java.util.Arrays;
import java.util.List;

class LineInputParser implements InputParser<String> {

    public List<String> parse(String content) {
        String[] splitByLineEscape = content.split(ParserConstant.WINDOWS_LINE_BREAK);
        return Arrays.asList(splitByLineEscape);
    }
}
