package fi.eriran.day2;

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
