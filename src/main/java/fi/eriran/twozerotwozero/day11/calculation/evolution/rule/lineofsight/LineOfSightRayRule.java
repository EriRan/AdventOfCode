package fi.eriran.twozerotwozero.day11.calculation.evolution.rule.lineofsight;

/**
 * How much of the coordinates to change when moving forward on a line of sight of a single direction
 */
class LineOfSightRayRule {

    private final int xIncrement;
    private final int yIncrement;

    public LineOfSightRayRule(int xIncrement, int yIncrement) {
        this.xIncrement = xIncrement;
        this.yIncrement = yIncrement;
    }

    public int getxIncrement() {
        return xIncrement;
    }

    public int getyIncrement() {
        return yIncrement;
    }
}
