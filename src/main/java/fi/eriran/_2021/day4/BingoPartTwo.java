package fi.eriran._2021.day4;

import fi.eriran._2021.day4.calculation.BingoBoardLastWinningBoardCalculator;
import fi.eriran._2021.day4.parser.BingoParser;

import java.util.List;

public class BingoPartTwo {

    public long calculateFinalScore(List<String> inputLines) {
        return new BingoBoardLastWinningBoardCalculator()
                .calculate(new BingoParser().parse(inputLines));
    }
}
