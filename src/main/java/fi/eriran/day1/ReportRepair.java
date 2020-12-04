package fi.eriran.day1;

import java.io.IOException;
import java.util.Collection;

public class ReportRepair {

    public void repair() throws IOException {
        Collection<Integer> day1Input = new InputParser().parse("day1Input");
        day1Input.stream().sorted(Integer::compareTo);
    }
}
