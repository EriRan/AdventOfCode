package fi.eriran.day6.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * The correct questions for a group
 */
public class GroupCustomForm {

    private final Set<Character> questionCodes;

    public GroupCustomForm() {
        questionCodes = new HashSet<>();
    }

    public Set<Character> getQuestionCodes() {
        return questionCodes;
    }
}
