package fi.eriran._2020.day2.philosopher;

import fi.eriran.common.parser.multiline.LineInputParserProxy;
import fi.eriran._2020.day2.philosopher.counter.PartOneValidPasswordCounter;

public class PasswordPhilosopherPartOne implements PasswordPhilosopher {

    public int countValidPasswords(String resourceFolderFilename) {
        return new PartOneValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParserProxy().parse(resourceFolderFilename)
                )
        );
    }
}
