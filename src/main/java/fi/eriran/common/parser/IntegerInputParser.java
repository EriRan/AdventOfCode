package fi.eriran.common.parser;

import fi.eriran.common.parser.constant.ParserConstant;

import java.util.ArrayList;
import java.util.List;

class IntegerInputParser implements InputParser<Integer> {

    public List<Integer> parse(String content) {
        //Get file content
        String[] splitByLineEscape = content.split(ParserConstant.WINDOWS_LINE_BREAK);
        List<Integer> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByLineEscape) {
            numbers.add(Integer.parseInt(numberString));
        }
        return numbers;
    }
}
