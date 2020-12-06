package fi.eriran.day2.philosopher;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day2.philosopher.counter.PartOneValidPasswordCounter;

import java.io.IOException;

public class PasswordPhilosopherPartOne implements PasswordPhilosopher {

    public int countValidPasswords(String resourceFolderFilename) throws IOException {
        return new PartOneValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParserProxy().parse(resourceFolderFilename)
                )
        );
    }
}
