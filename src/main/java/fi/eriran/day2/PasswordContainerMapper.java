package fi.eriran.day2;

import fi.eriran.day2.pojo.PasswordContainer;
import fi.eriran.day2.pojo.PasswordRule;

import java.util.Collection;
import java.util.stream.Collectors;

class PasswordContainerMapper {

    public Collection<PasswordContainer> map(Collection<String> lines) {
        return lines.stream()
                .map(line -> {
                    String[] splitBySpace = line.split(" ");
                    //First index is the min and max of the password rule

                    return new PasswordContainer(
                            createPasswordRule(splitBySpace[0], splitBySpace[1]),
                            splitBySpace[2]
                    );
                })
                .collect(Collectors.toList());
    }

    private PasswordRule createPasswordRule(String minAndMax, String ruleCharacter) {
        String[] minAndMaxSplitByDash = minAndMax.split("-");
        //There should be only two characters: the target char and a colon. We can ignore the colon and just get the
        // character at the first index
        char targetChar = ruleCharacter.charAt(0);
        return new PasswordRule(
                Integer.parseInt(minAndMaxSplitByDash[0]),
                Integer.parseInt(minAndMaxSplitByDash[1]),
                targetChar
        );
    }
}
