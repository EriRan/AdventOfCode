package fi.eriran.day2;

import fi.eriran.day2.pojo.PasswordContainer;

import java.util.Collection;

public interface ValidPasswordCounter {

    int count(Collection<PasswordContainer> containers);

}
