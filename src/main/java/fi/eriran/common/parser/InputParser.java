package fi.eriran.common.parser;

import java.util.List;

public interface InputParser<T> {
    List<T> parse(String content);
}
