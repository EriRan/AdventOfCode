package fi.eriran.day4.processor;

import java.io.IOException;
import java.net.URL;

public interface PassportProcessor {
    long process(URL filepath) throws IOException;
}
