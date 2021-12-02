package fi.eriran._2020.day6.parser;

import fi.eriran._2020.day6.pojo.GroupCustomFormAnyone;

import java.util.ArrayList;
import java.util.Collection;

public class GroupCustomFormAnyoneFactory {

    public Collection<GroupCustomFormAnyone> build(Collection<Collection<Character>> rawInput) {
        Collection<GroupCustomFormAnyone> allForms = new ArrayList<>();
        for (Collection<Character> characters : rawInput) {
            GroupCustomFormAnyone newGroupCustomerForm = new GroupCustomFormAnyone();
            newGroupCustomerForm.getQuestionCodes().addAll(characters);
            allForms.add(newGroupCustomerForm);
        }
        return allForms;
    }
}
