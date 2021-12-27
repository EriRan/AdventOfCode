package fi.eriran._2021.day4.calculation.support;

import fi.eriran._2021.day4.parser.objects.BingoBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinningBingoScannerTest {

    private final WinningBingoScanner winningBingoScanner = new WinningBingoScanner();

    @Test
    void horizontalWinningLine() {
        BingoBoard board = new BingoBoard();
        board.getDrawnLocations()[0][0] = true;
        board.getDrawnLocations()[0][1] = true;
        board.getDrawnLocations()[0][2] = true;
        board.getDrawnLocations()[0][3] = true;
        board.getDrawnLocations()[0][4] = true;
        assertTrue(winningBingoScanner.hasBoardWon(board));
    }

    @Test
    void verticalWinningLine() {
        BingoBoard board = new BingoBoard();
        board.getDrawnLocations()[0][0] = true;
        board.getDrawnLocations()[1][0] = true;
        board.getDrawnLocations()[2][0] = true;
        board.getDrawnLocations()[3][0] = true;
        board.getDrawnLocations()[4][0] = true;
        assertTrue(winningBingoScanner.hasBoardWon(board));
    }

    @Test
    void noWinningLines() {
        assertFalse(winningBingoScanner.hasBoardWon(new BingoBoard()));
    }

    @Test
    void missingOneFromHorizontalWin() {
        BingoBoard board = new BingoBoard();
        board.getDrawnLocations()[0][0] = true;
        board.getDrawnLocations()[0][1] = true;
        board.getDrawnLocations()[0][2] = true;
        board.getDrawnLocations()[0][3] = false;
        board.getDrawnLocations()[0][4] = true;
        assertFalse(winningBingoScanner.hasBoardWon(board));
    }
}