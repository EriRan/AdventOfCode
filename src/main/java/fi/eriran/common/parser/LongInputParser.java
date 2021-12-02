package fi.eriran.common.parser;

import fi.eriran.common.parser.constant.ParserConstant;

import java.util.ArrayList;
import java.util.List;

class LongInputParser implements InputParser<Long> {
    @Override
    public List<Long> parse(String content) {
        //Get file content
        String[] splitByLineEscape = content.split(ParserConstant.LINE_BREAK_REGEX);
        List<Long> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByLineEscape) {
            numbers.add(Long.parseLong(numberString));
        }
        return numbers;
    }
}
