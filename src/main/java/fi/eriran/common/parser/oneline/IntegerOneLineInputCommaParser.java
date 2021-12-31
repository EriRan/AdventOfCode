package fi.eriran.common.parser.oneline;

import java.util.ArrayList;
import java.util.List;

/**
 * Parser for an input file that has only one line with commas splitting the numbers
 */
class IntegerOneLineInputCommaParser implements OneLineInputParser<Integer> {

    public List<Integer> parse(String content, String splitRegex) {
        //Get file content
        String[] splitByRegex = content.split(splitRegex);
        List<Integer> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByRegex) {
            numbers.add(Integer.parseInt(numberString));
        }
        return numbers;
    }
}
