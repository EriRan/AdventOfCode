package fi.eriran._2020.day2.philosopher.counter;

import fi.eriran._2020.day2.philosopher.pojo.PasswordContainer;

import java.util.Collection;

public interface ValidPasswordCounter {

    int count(Collection<PasswordContainer> containers);

}
