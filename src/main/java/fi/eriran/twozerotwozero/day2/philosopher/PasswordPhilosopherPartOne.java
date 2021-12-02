package fi.eriran.twozerotwozero.day2.philosopher;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day2.philosopher.counter.PartOneValidPasswordCounter;

public class PasswordPhilosopherPartOne implements PasswordPhilosopher {

    public int countValidPasswords(String resourceFolderFilename) {
        return new PartOneValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParserProxy().parse(resourceFolderFilename)
                )
        );
    }
}
