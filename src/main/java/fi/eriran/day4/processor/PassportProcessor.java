package fi.eriran.day4.processor;

import java.io.IOException;

public interface PassportProcessor {
    long process(String resorceFolderFilename) throws IOException;
}
