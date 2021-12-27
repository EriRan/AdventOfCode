package fi.eriran._2021.day4.calculation;

import fi.eriran._2021.day4.calculation.support.DrawnNumberMarker;
import fi.eriran._2021.day4.calculation.support.WinningBingoScanner;
import fi.eriran._2021.day4.calculation.support.WinningFinalScoreCalculator;
import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;
import fi.eriran._2021.day4.parser.objects.BingoState;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BingoBoardLastWinningBoardCalculator {

    private final WinningBingoScanner winningBingoScanner;
    private final DrawnNumberMarker drawnNumberMarker;
    private final WinningFinalScoreCalculator winningFinalScoreCalculator;

    public BingoBoardLastWinningBoardCalculator() {
        winningBingoScanner = new WinningBingoScanner();
        drawnNumberMarker = new DrawnNumberMarker();
        winningFinalScoreCalculator = new WinningFinalScoreCalculator();
    }

    public long calculate(BingoState state) {
        int[] bingoNumbers = state.getBingoNumbers();
        List<BingoBoard> boards = state.getBoards();
        Collection<Integer> winningBoardIndexes = new ArrayList<>();

        for (int i = 0, bingoNumbersLength = bingoNumbers.length; i < bingoNumbersLength; i++) {
            int drawnNumber = bingoNumbers[i];

            for (int boardIndex = 0; boardIndex < boards.size(); boardIndex++) {
                // If a board has already won, don't bother marking a new number for it
                if (winningBoardIndexes.contains(boardIndex)) {
                    continue;
                }
                BingoBoard board = boards.get(boardIndex);
                drawnNumberMarker.mark(board, drawnNumber);
            }
            // Check if it is possible for a board to have won at this point
            // E.g. If we have dimensions of 5x5, a board can't have won before the fifth number
            if (!isVictoryPossible(i)) {
                continue;
            }
            for (int boardIndex = 0, boardsSize = boards.size(); boardIndex < boardsSize; boardIndex++) {
                // If a board has already won, don't bother checking if it won
                if (winningBoardIndexes.contains(boardIndex)) {
                    continue;
                }
                BingoBoard board = boards.get(boardIndex);
                if (winningBingoScanner.hasBoardWon(board)) {
                    winningBoardIndexes.add(boardIndex);
                    if (winningBoardIndexes.size() == boards.size()) {
                        return winningFinalScoreCalculator.calculate(board, drawnNumber);
                    }
                }
            }
        }
        throw new IllegalArgumentException("All boards did not win!");
    }

    /**
     * When we have a 5x5 board, 5 numbers must be drawn before a board can win the game
     */
    private boolean isVictoryPossible(int currentIndex) {
        return currentIndex >= BingoConstant.BOARD_DIMENSIONS - 1;
    }
}
