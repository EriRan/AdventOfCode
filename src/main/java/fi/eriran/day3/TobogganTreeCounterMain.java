package fi.eriran.day3;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day3.parser.MapGenerator;

import java.io.IOException;

public class TobogganTreeCounterMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Trees encountered: "
                + new TobogganTreeCounter()
                .count(
                        new MapGenerator().generate(
                                new LineInputParser().parse(Resources.getResource("day3Input"))
                        )
                )
        );
    }
}
