package fi.eriran.day2;

import java.io.IOException;
import java.net.URL;

public class PasswordPhilosopher {

    public int countValidPasswords(URL filepath) throws IOException {
        return new ValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParser().parse(filepath)
                )
        );
    }
}
