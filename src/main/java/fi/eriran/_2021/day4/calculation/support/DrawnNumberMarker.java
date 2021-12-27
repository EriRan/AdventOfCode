package fi.eriran._2021.day4.calculation.support;

import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;

public class DrawnNumberMarker {

    /**
     * Search for the drawn number from the board and mark it as drawn if it is found
     *
     * @param board       Bingo Board
     * @param drawnNumber The number that was drawn
     */
    public void mark(BingoBoard board, int drawnNumber) {
        for (int x = 0; x < BingoConstant.BOARD_DIMENSIONS; x++) {
            for (int y = 0; y < BingoConstant.BOARD_DIMENSIONS; y++) {
                if (board.getBoardMatrix()[x][y] == drawnNumber) {
                    board.getDrawnLocations()[x][y] = true;
                }
            }
        }
    }
}
