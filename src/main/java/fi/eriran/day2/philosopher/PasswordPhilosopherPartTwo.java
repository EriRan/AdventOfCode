package fi.eriran.day2.philosopher;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day2.philosopher.counter.PartTwoValidPasswordCounter;

import java.io.IOException;

public class PasswordPhilosopherPartTwo implements PasswordPhilosopher {
    @Override
    public int countValidPasswords(String resourceFolderFilename) throws IOException {
        return new PartTwoValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new LineInputParserProxy().parse(resourceFolderFilename)
                )
        );
    }
}
