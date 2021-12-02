package fi.eriran._2020.day5.seat.decode.column;

public class ColumnSymbolToBinaryConverter {

    public String convert(char character) {
        switch (character) {
            case 'L':
                return "0";
            case 'R':
                return "1";
            default:
                throw new IllegalArgumentException("Encountered unknown character: " + character);
        }
    }
}
