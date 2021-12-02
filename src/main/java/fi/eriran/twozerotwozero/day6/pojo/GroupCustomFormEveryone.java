package fi.eriran.twozerotwozero.day6.pojo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A group of people and the questions they answered "YES" to
 */
public class GroupCustomFormEveryone {
    private final Collection<PersonAnswers> personAnswers;

    public GroupCustomFormEveryone() {
        personAnswers = new ArrayList<>();
    }

    public Collection<PersonAnswers> getPersonAnswers() {
        return personAnswers;
    }
}
