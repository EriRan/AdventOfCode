package fi.eriran.day1;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Get the numbers from provided filename which is fetched from resources directory
 */
class NumberInputParser {

    public List<Integer> parse(URL fileURL) throws IOException {
        //Get file content
        String fullFileContent = Resources.toString(fileURL, StandardCharsets.UTF_8);
        String[] splitByLineEscape = fullFileContent.split("\r\n");
        List<Integer> numbers = new ArrayList<>();
        //Assuming they are all valid numbers
        for (String numberString : splitByLineEscape) {
            numbers.add(Integer.parseInt(numberString));
        }
        return numbers;
    }
}
