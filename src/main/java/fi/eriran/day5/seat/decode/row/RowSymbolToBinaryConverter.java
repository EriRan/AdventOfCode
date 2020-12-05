package fi.eriran.day5.seat.decode.row;

class RowSymbolToBinaryConverter {

    public String convert(char symbol) {
        switch (symbol) {
            case 'F':
                return "0";
            case 'B':
                return "1";
            default:
                throw new IllegalArgumentException("Encountered unknown character: " + symbol);
        }
    }
}
