package fi.eriran._2020.day5.seat.decode.row;

public class RowDecoder {

    private final RowSymbolToBinaryConverter rowSymbolToBinaryConverter;

    public RowDecoder() {
        rowSymbolToBinaryConverter = new RowSymbolToBinaryConverter();
    }

    /**
     * Its actually a binary int in disguise
     */
    public int decode(String substring) {
        return Integer.parseInt(convertToBinaryString(substring), 2);
    }

    private String convertToBinaryString(String substring) {
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (char character : substring.toCharArray()) {
            binaryStringBuilder.append(rowSymbolToBinaryConverter.convert(character));
        }
        return binaryStringBuilder.toString();
    }
}
