package fi.eriran.day2.philosopher;

import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day2.philosopher.counter.PartTwoValidPasswordCounter;

import java.io.IOException;
import java.net.URL;

public class PasswordPhilosopherPartTwo implements PasswordPhilosopher {
    @Override
    public int countValidPasswords(URL filepath) throws IOException {
        return new PartTwoValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParser().parse(filepath)
                )
        );
    }
}
