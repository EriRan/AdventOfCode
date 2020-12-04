package fi.eriran.day2.philosopher;

import java.io.IOException;
import java.net.URL;

public interface PasswordPhilosopher {

    int countValidPasswords(URL filepath) throws IOException;
}
