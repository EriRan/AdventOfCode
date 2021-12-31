package fi.eriran.common.parser.multiline;

import java.util.List;

public interface MultiLineInputParser<T> {
    List<T> parse(String content);
}
