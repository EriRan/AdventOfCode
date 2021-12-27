package fi.eriran._2021.day4.calculation.support;

import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;

public class WinningBingoScanner {

    public boolean hasBoardWon(BingoBoard bingoBoard) {
        // Search wins from vertical lines
        for (int x = 0; x < BingoConstant.BOARD_DIMENSIONS; x++) {
            if (verticalLineHasWon(bingoBoard, x)) {
                return true;
            }
        }
        // Search wins from horizontal lines
        for (int y = 0; y < BingoConstant.BOARD_DIMENSIONS; y++) {
            if (horizontalLineHasWon(bingoBoard, y)) {
                return true;
            }
        }
        // No wins. Return false.
        return false;
    }

    private boolean horizontalLineHasWon(BingoBoard bingoBoard, int y) {
        for (int x = 0; x < BingoConstant.BOARD_DIMENSIONS; x++) {
            if (!locationHasBeenDrawn(bingoBoard, x, y)) {
                return false;
            }
        }
        return true;
    }

    private boolean verticalLineHasWon(BingoBoard bingoBoard, int x) {
        for (int y = 0; y < BingoConstant.BOARD_DIMENSIONS; y++) {
            if (!locationHasBeenDrawn(bingoBoard, x, y)) {
                return false;
            }
        }
        return true;
    }

    private boolean locationHasBeenDrawn(BingoBoard bingoBoard, int x, int y) {
        return bingoBoard.getDrawnLocations()[y][x];
    }
}
