package fi.eriran.day12.parser;

import fi.eriran.day12.parser.converter.CharacterToCommandConverter;
import fi.eriran.day12.pojo.DirectionCommand;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class DirectionCommandParser {

    private final CharacterToCommandConverter characterToCommandConverter;

    public DirectionCommandParser() {
        characterToCommandConverter = new CharacterToCommandConverter();
    }

    public List<DirectionCommand> parse(List<String> lines) {
        return lines.stream()
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    private DirectionCommand parseLine(String line) {
        if (StringUtils.isBlank(line)) {
            throw new IllegalArgumentException("Illegal empty line encountered");
        }
        return new DirectionCommand(
                characterToCommandConverter.convert(line.charAt(0)),
                Integer.parseInt(line.substring(1))
        );
    }
}
