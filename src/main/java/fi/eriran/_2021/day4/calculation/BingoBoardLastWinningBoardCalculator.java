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

        for (int drawnNumberIndex = 0, bingoNumbersLength = bingoNumbers.length; drawnNumberIndex < bingoNumbersLength; drawnNumberIndex++) {
            int drawnNumber = bingoNumbers[drawnNumberIndex];

            for (int boardIndex = 0; boardIndex < boards.size(); boardIndex++) {
                BingoBoard board = boards.get(boardIndex);
                processBoard(board, boardIndex, winningBoardIndexes, drawnNumber, drawnNumberIndex);
                // Did we just process the last winning board? If so, calculate the final score for it
                if (winningBoardIndexes.size() == boards.size()) {
                    return winningFinalScoreCalculator.calculate(board, drawnNumber);
                }
            }
        }
        throw new IllegalArgumentException("All boards did not win!");
    }

    private void processBoard(BingoBoard board,
                              int boardIndex,
                              Collection<Integer> winningBoardIndexes,
                              int drawnNumber,
                              int drawnNumberIndex) {
        // If a board has already won, don't bother processing it
        if (winningBoardIndexes.contains(boardIndex)) {
            return;
        }
        // Try to find drawn number from the board and mark it
        drawnNumberMarker.mark(board, drawnNumber);
        if (!isVictoryPossible(drawnNumberIndex)) {
            return;
        }
        if (winningBingoScanner.hasBoardWon(board)) {
            winningBoardIndexes.add(boardIndex);
        }
    }

    /**
     * When we have a 5x5 board, 5 numbers must be drawn before a board can win the game
     */
    private boolean isVictoryPossible(int numbersDrawn) {
        return numbersDrawn >= BingoConstant.BOARD_DIMENSIONS - 1;
    }
}
