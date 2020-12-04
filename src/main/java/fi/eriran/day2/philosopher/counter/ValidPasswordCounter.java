package fi.eriran.day2.philosopher.counter;

import fi.eriran.day2.philosopher.pojo.PasswordContainer;

import java.util.Collection;

public interface ValidPasswordCounter {

    int count(Collection<PasswordContainer> containers);

}
