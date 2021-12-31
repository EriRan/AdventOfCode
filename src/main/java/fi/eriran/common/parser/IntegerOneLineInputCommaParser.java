package fi.eriran.common.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Parser for an input file that has only one line with commas splitting the numbers
 */
class IntegerOneLineInputCommaParser implements InputParser<Integer> {

    public List<Integer> parse(String content) {
        //Get file content
        String[] splitByRegex = content.split(",");
        List<Integer> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByRegex) {
            numbers.add(Integer.parseInt(numberString));
        }
        return numbers;
    }
}
