package fi.eriran._2021.day2;

import fi.eriran._2021.day2.parser.MovementCommandParser;

import java.util.List;

public class SubmarinePositionMultiplicationGenerator {

    public int generate(List<String> input) {
        return new SubmarineControl().pilot(
                new MovementCommandParser().parse(input)
        );
    }
}
