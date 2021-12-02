package fi.eriran.common.parser;

import fi.eriran.common.parser.constant.ParserConstant;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Parser that turns a String into a List of Strings that contain all the lines in the content String
 */
class LineInputParser implements InputParser<String> {

    public List<String> parse(String content) {
        if (StringUtils.isBlank(content)) {
            return Collections.emptyList();
        }
        String[] splitByLineEscape = content.split(ParserConstant.LINE_BREAK_REGEX);
        return Arrays.asList(splitByLineEscape);
    }
}
