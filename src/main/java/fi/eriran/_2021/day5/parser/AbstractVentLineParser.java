package fi.eriran._2021.day5.parser;

import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;

public abstract class AbstractVentLineParser {

    public abstract Collection<VentLine> parse(Collection<String> lines);

    protected VentLine parseOneLine(String line) {
        VentLine newVentLine = new VentLine();
        String[] twoPoints = line.split("->");

        String[] xAndYOne = twoPoints[0].split(",");
        newVentLine.setX1(Integer.parseInt(xAndYOne[0].trim()));
        newVentLine.setY1(Integer.parseInt(xAndYOne[1].trim()));

        String[] xAndYTwo = twoPoints[1].split(",");
        newVentLine.setX2(Integer.parseInt(xAndYTwo[0].trim()));
        newVentLine.setY2(Integer.parseInt(xAndYTwo[1].trim()));

        return newVentLine;
    }
}
