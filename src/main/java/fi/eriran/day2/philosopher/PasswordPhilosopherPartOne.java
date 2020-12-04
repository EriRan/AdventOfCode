package fi.eriran.day2.philosopher;

import fi.eriran.day2.philosopher.counter.PartOneValidPasswordCounter;

import java.io.IOException;
import java.net.URL;

public class PasswordPhilosopherPartOne implements PasswordPhilosopher {

    public int countValidPasswords(URL filepath) throws IOException {
        return new PartOneValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParser().parse(filepath)
                )
        );
    }
}
