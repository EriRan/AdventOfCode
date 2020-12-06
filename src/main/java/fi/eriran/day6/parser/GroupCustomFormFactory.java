package fi.eriran.day6.parser;

import fi.eriran.day6.pojo.GroupCustomForm;

import java.util.ArrayList;
import java.util.Collection;

public class GroupCustomFormFactory {

    public Collection<GroupCustomForm> build(Collection<Collection<Character>> rawInput) {
        Collection<GroupCustomForm> groupCustomForms = new ArrayList<>();
        for (Collection<Character> characters : rawInput) {
            GroupCustomForm newGroupCustomerForm = new GroupCustomForm();
            newGroupCustomerForm.getQuestionCodes().addAll(characters);
            groupCustomForms.add(newGroupCustomerForm);
        }
        return groupCustomForms;
    }
}
