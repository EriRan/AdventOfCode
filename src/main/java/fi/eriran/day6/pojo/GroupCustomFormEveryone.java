package fi.eriran.day6.pojo;

import java.util.ArrayList;
import java.util.Collection;

public class GroupCustomFormEveryone {
    private final Collection<PersonAnswers> personAnswers;

    public GroupCustomFormEveryone() {
        personAnswers = new ArrayList<>();
    }

    public Collection<PersonAnswers> getPersonAnswers() {
        return personAnswers;
    }
}
