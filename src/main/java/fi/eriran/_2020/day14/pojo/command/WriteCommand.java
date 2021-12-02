package fi.eriran._2020.day14.pojo.command;

public class WriteCommand implements BitCommand {

    private final int index;
    private final int value;

    public WriteCommand(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
}
