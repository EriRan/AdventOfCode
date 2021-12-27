package fi.eriran._2021.day4.parser.objects;

import fi.eriran._2021.day4.constant.BingoConstant;

public class BingoBoard {

    private final int[][] boardMatrix;
    private final boolean[][] drawnLocations;

    public BingoBoard() {
        // The boards are always 5x5
        this.boardMatrix = new int[BingoConstant.BOARD_DIMENSIONS][BingoConstant.BOARD_DIMENSIONS];
        this.drawnLocations = new boolean[BingoConstant.BOARD_DIMENSIONS][BingoConstant.BOARD_DIMENSIONS];
    }

    public int[][] getBoardMatrix() {
        return boardMatrix;
    }

    public boolean[][] getDrawnLocations() {
        return drawnLocations;
    }
}
