package fi.eriran.common.parser.multiline;

import fi.eriran.common.parser.constant.ParserConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * Parse input file that has one integer per line
 */
class IntegerMultiLineInputParser implements MultiLineInputParser<Integer> {

    public List<Integer> parse(String content) {
        //Get file content
        String[] splitByLineEscape = content.split(ParserConstant.LINE_BREAK_REGEX);
        List<Integer> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByLineEscape) {
            numbers.add(Integer.parseInt(numberString));
        }
        return numbers;
    }
}
