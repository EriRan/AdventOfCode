package fi.eriran._2021.day4.parser.objects;

import java.util.List;

public class BingoState {

    private int[] bingoNumbers;
    private List<BingoBoard> boards;

    public BingoState(int[] bingoNumbers, List<BingoBoard> boards) {
        this.bingoNumbers = bingoNumbers;
        this.boards = boards;
    }

    public int[] getBingoNumbers() {
        return bingoNumbers;
    }

    public void setBingoNumbers(int[] bingoNumbers) {
        this.bingoNumbers = bingoNumbers;
    }

    public List<BingoBoard> getBoards() {
        return boards;
    }

    public void setBoards(List<BingoBoard> boards) {
        this.boards = boards;
    }
}
