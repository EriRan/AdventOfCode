package fi.eriran._2021.day4.calculation.support;

import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;

public class WinningFinalScoreCalculator {

    public long calculate(BingoBoard board, int lastNumberDrawn) {
        long finalScore = 0;
        for (int x = 0; x < BingoConstant.BOARD_DIMENSIONS; x++) {
            for (int y = 0; y < BingoConstant.BOARD_DIMENSIONS; y++) {
                if (!board.getDrawnLocations()[y][x]) {
                    finalScore += board.getBoardMatrix()[y][x];
                }
            }
        }
        return finalScore * lastNumberDrawn;
    }
}
