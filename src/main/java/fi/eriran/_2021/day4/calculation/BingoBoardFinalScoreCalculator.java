package fi.eriran._2021.day4.calculation;

import fi.eriran._2021.day4.calculation.support.DrawnNumberMarker;
import fi.eriran._2021.day4.calculation.support.WinningBingoScanner;
import fi.eriran._2021.day4.calculation.support.WinningFinalScoreCalculator;
import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;
import fi.eriran._2021.day4.parser.objects.BingoState;

public class BingoBoardFinalScoreCalculator {

    private final WinningBingoScanner winningBingoScanner;
    private final DrawnNumberMarker drawnNumberMarker;
    private final WinningFinalScoreCalculator winningFinalScoreCalculator;

    public BingoBoardFinalScoreCalculator() {
        winningBingoScanner = new WinningBingoScanner();
        drawnNumberMarker = new DrawnNumberMarker();
        winningFinalScoreCalculator = new WinningFinalScoreCalculator();
    }

    public long calculate(BingoState state) {
        int[] bingoNumbers = state.getBingoNumbers();
        for (int i = 0, bingoNumbersLength = bingoNumbers.length; i < bingoNumbersLength; i++) {
            int drawnNumber = bingoNumbers[i];
            for (BingoBoard board : state.getBoards()) {
                drawnNumberMarker.mark(board, drawnNumber);
            }
            // Check if it is possible for a board to have won at this point
            // E.g. If we have dimensions of 5x5, a board can't have won before the fifth number
            if (!haveOneLineLengthAmountBeenDrawn(i)) {
                continue;
            }
            for (BingoBoard board : state.getBoards()) {
                if (winningBingoScanner.hasBoardWon(board)) {
                    return winningFinalScoreCalculator.calculate(board, drawnNumber);
                }
            }
        }
        throw new IllegalArgumentException("No board won!");
    }

    private boolean haveOneLineLengthAmountBeenDrawn(int i) {
        return i < BingoConstant.BOARD_DIMENSIONS - 1;
    }
}
