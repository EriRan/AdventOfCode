package fi.eriran._2021.day2;

import fi.eriran._2021.day2.parser.MovementCommandParser;

import java.util.List;

public class SubmarinePositionMultiplicationGenerator {

    public int generateSimple(List<String> input) {
        return new SubmarineSimpleControl().pilot(
                new MovementCommandParser().parse(input)
        );
    }

    public int generateAim(List<String> input) {
        return new SubmarineAimControl().pilot(
                new MovementCommandParser().parse(input)
        );
    }
}
