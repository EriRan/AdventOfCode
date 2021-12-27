package fi.eriran._2021.day4;

import fi.eriran._2021.day4.calculation.BingoBoardWinningScoreCalculator;
import fi.eriran._2021.day4.parser.BingoParser;

import java.util.List;

public class BingoPartOne {

    public long calculateFinalScore(List<String> inputLines) {
        return new BingoBoardWinningScoreCalculator()
                .calculate(new BingoParser().parse(inputLines));
    }
}
