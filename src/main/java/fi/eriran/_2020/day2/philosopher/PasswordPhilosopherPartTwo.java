package fi.eriran._2020.day2.philosopher;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day2.philosopher.counter.PartTwoValidPasswordCounter;

public class PasswordPhilosopherPartTwo implements PasswordPhilosopher {
    @Override
    public int countValidPasswords(String resourceFolderFilename) {
        return new PartTwoValidPasswordCounter().count(
                new PasswordContainerMapper().map(
                        new MultiLineInputParserProxy().parse(resourceFolderFilename)
                )
        );
    }
}
