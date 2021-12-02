package fi.eriran.twozerotwozero.day5.seat.decode.column;

public class ColumnDecoder {

    private final ColumnSymbolToBinaryConverter columnSymbolToBinaryConverter;

    public ColumnDecoder() {
        columnSymbolToBinaryConverter = new ColumnSymbolToBinaryConverter();
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
            binaryStringBuilder.append(columnSymbolToBinaryConverter.convert(character));
        }
        return binaryStringBuilder.toString();
    }
}
