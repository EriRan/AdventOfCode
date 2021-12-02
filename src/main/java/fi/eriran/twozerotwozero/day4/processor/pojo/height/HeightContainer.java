package fi.eriran.twozerotwozero.day4.processor.pojo.height;

public class HeightContainer {

    private final int height;
    private final HeightUnit unit;

    public HeightContainer(int height, HeightUnit unit) {
        this.height = height;
        this.unit = unit;
    }

    public int getHeight() {
        return height;
    }

    public HeightUnit getUnit() {
        return unit;
    }
}
