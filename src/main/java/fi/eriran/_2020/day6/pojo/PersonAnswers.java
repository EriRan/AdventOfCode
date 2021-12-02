package fi.eriran._2020.day6.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Questions that a person answered "YES" to
 */
public class PersonAnswers {

    private final Set<Character> questionCodes;

    public PersonAnswers() {
        questionCodes = new HashSet<>();
    }

    public Set<Character> getQuestionCodes() {
        return questionCodes;
    }
}
