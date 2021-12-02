package fi.eriran._2020.day11.calculation.evolution.rule.lineofsight;

public class LineOfSightRayRuleFactory {

    public LineOfSightRayRule createUpperLeft() {
        return new LineOfSightRayRule(-1,-1);
    }

    public LineOfSightRayRule createUp() {
        return new LineOfSightRayRule(0,-1);
    }

    public LineOfSightRayRule createUpperRight() {
        return new LineOfSightRayRule(1,-1);
    }

    public LineOfSightRayRule createRight() {
        return new LineOfSightRayRule(1,0);
    }

    public LineOfSightRayRule createLowerRight() {
        return new LineOfSightRayRule(1,1);
    }

    public LineOfSightRayRule createDown() {
        return new LineOfSightRayRule(0,1);
    }

    public LineOfSightRayRule createLowerLeft() {
        return new LineOfSightRayRule(-1,1);
    }

    public LineOfSightRayRule createLeft() {
        return new LineOfSightRayRule(-1,0);
    }
}
