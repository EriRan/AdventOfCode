package fi.eriran._2020.day6.parser;

import fi.eriran._2020.day6.pojo.GroupCustomFormEveryone;
import fi.eriran._2020.day6.pojo.PersonAnswers;

import java.util.ArrayList;
import java.util.Collection;

public class GroupCustomFormEveryoneFactory {

    public Collection<GroupCustomFormEveryone> build(Collection<Collection<PersonAnswers>> rawInput) {
        Collection<GroupCustomFormEveryone> allForms = new ArrayList<>();
        for (Collection<PersonAnswers> personAnswers : rawInput) {
            GroupCustomFormEveryone groupCustomFormEveryone = new GroupCustomFormEveryone();
            groupCustomFormEveryone.getPersonAnswers().addAll(personAnswers);
            allForms.add(groupCustomFormEveryone);
        }
        return allForms;
    }
}
