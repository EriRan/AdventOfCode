package fi.eriran.common.parser.oneline;

import java.util.List;

public interface OneLineInputParser<T> {

    List<T> parse(String content, String splitRegex);
}
