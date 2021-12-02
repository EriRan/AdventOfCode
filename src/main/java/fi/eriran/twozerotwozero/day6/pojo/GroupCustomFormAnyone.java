package fi.eriran.twozerotwozero.day6.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * The correct questions for a group
 */
public class GroupCustomFormAnyone {

    private final Set<Character> questionCodes;

    public GroupCustomFormAnyone() {
        questionCodes = new HashSet<>();
    }

    public Set<Character> getQuestionCodes() {
        return questionCodes;
    }
}
