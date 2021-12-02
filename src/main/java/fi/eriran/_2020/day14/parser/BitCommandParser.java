package fi.eriran._2020.day14.parser;

import fi.eriran._2020.day14.pojo.command.BitCommand;
import fi.eriran._2020.day14.pojo.command.MaskCommand;
import fi.eriran._2020.day14.pojo.command.WriteCommand;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BitCommandParser {

    public List<BitCommand> parse(List<String> lines) {
        return lines.stream()
                .map(this::parseOne)
                .collect(Collectors.toList());
    }

    private BitCommand parseOne(String line) {
        if (StringUtils.isBlank(line)) {
            throw new IllegalArgumentException("Blank line encountered");
        }
        if (line.contains("mask")) {
            String bitmask = line.split("=")[1].trim();
            return new MaskCommand(bitmask);
        } else if (line.contains("mem")) {
            return new WriteCommand(
                    parseWriteIndex(line),
                    parseWriteValue(line)
            );
        } else {
            throw new IllegalArgumentException("Unparseable line encountered: " + line);
        }
    }

    private int parseWriteIndex(String line) {
        return Integer.parseInt(
                line.substring(
                        line.indexOf('[') + 1,
                        line.indexOf(']')
                )
        );
    }

    private int parseWriteValue(String line) {
        return Integer.parseInt(line.split("=")[1].trim());
    }
}
