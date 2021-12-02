package fi.eriran._2020.day4.processor;

import java.io.IOException;

public interface PassportProcessor {
    long process(String resorceFolderFilename) throws IOException;
}
