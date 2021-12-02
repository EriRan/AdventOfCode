package fi.eriran.twozerotwozero.day14.pojo.command;

/**
 * Overwrite the current bitmask with the value
 */
public class MaskCommand implements BitCommand {

    private final String value;

    public MaskCommand(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
