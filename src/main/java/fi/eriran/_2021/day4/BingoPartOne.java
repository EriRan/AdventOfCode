package fi.eriran._2021.day4;

import fi.eriran._2021.day4.calculation.BingoBoardFinalScoreCalculator;
import fi.eriran._2021.day4.parser.BingoParser;

import java.util.List;

public class BingoPartOne {

    public long calculateFinalScore(List<String> inputLines) {
        return new BingoBoardFinalScoreCalculator()
                .calculate(new BingoParser().parse(inputLines));
    }
}
