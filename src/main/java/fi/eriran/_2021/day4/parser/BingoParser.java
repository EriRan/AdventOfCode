package fi.eriran._2021.day4.parser;

import fi.eriran._2021.day4.constant.BingoConstant;
import fi.eriran._2021.day4.parser.objects.BingoBoard;
import fi.eriran._2021.day4.parser.objects.BingoState;

import java.util.ArrayList;
import java.util.List;

public class BingoParser {

    public BingoState parse(List<String> lines) {
        return new BingoState(
                parseBingoNumbers(lines),
                parseBoards(lines)
        );
    }

    private List<BingoBoard> parseBoards(List<String> lines) {
        List<BingoBoard> bingoBoards = new ArrayList<>();
        BingoBoard currentBingoBoard = new BingoBoard();
        int currentBoardY = 0;
        // Start from third line because the first and second contain the bingo numbers
        for (int lineIndex = 2; lineIndex < lines.size(); lineIndex++) {
            String currentLine = lines.get(lineIndex);
            // Empty line. Start creating next board
            if (currentLine.length() < 1) {
                bingoBoards.add(currentBingoBoard);
                currentBingoBoard = new BingoBoard();
                currentBoardY = 0;
                continue;
            }
            String[] currentBoardLine = currentLine.split(BingoConstant.REGEX_SPLIT_BY_WHITESPACE);
            for (int currentBoardX = 0; currentBoardX < currentBoardLine.length; currentBoardX++) {
                setOneBoardNumber(currentBingoBoard, currentBoardLine, currentBoardX, currentBoardY);
            }
            currentBoardY++;
        }
        return bingoBoards;
    }

    private void setOneBoardNumber(BingoBoard currentBingoBoard, String[] currentBoardLine, int currentBoardX, int currentBoardY) {
        currentBingoBoard.getBoardMatrix()[currentBoardX][currentBoardY] = Integer.parseInt(currentBoardLine[currentBoardX]);
    }

    private int[] parseBingoNumbers(List<String> lines) {
        String bingoNumbersLine = lines.get(0);
        String[] bingoNumberStrings = bingoNumbersLine.split(",");
        int[] bingoNumbers = new int[bingoNumberStrings.length];
        for (int i = 0; i < bingoNumberStrings.length; i++) {
            bingoNumbers[i] = Integer.parseInt(bingoNumberStrings[i]);
        }
        return bingoNumbers;
    }
}
