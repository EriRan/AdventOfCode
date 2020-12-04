package fi.eriran.day2;

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
