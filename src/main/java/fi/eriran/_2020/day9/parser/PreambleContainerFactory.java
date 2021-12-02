package fi.eriran._2020.day9.parser;

import fi.eriran._2020.day9.pojo.PreambleDefinition;

import java.util.List;

public class PreambleContainerFactory {

    public PreambleDefinition parser(List<Long> numbers, int preambleSize) {
        return new PreambleDefinition(numbers, preambleSize);
    }
}
