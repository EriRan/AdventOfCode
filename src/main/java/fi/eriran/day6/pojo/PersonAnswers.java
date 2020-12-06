package fi.eriran.day6.pojo;

import java.util.HashSet;
import java.util.Set;

public class PersonAnswers {

    private final Set<Character> questionCodes;

    public PersonAnswers() {
        questionCodes = new HashSet<>();
    }

    public Set<Character> getQuestionCodes() {
        return questionCodes;
    }
}
