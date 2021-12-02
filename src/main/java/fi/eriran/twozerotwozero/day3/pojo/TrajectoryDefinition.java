package fi.eriran.twozerotwozero.day3.pojo;

public class TrajectoryDefinition {

    private final int right;
    private final int down;

    public TrajectoryDefinition(int right, int down) {
        this.right = right;
        this.down = down;
    }

    public int getRight() {
        return right;
    }

    public int getDown() {
        return down;
    }
}
