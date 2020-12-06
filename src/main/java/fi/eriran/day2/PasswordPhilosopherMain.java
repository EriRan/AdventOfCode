package fi.eriran.day2;

import fi.eriran.day2.philosopher.PasswordPhilosopherPartOne;
import fi.eriran.day2.philosopher.PasswordPhilosopherPartTwo;

import java.io.IOException;

public class PasswordPhilosopherMain {

    public static void main(String[] args) throws IOException {
        System.out.println(
                "Part one valid passwords: " +
                        new PasswordPhilosopherPartOne().countValidPasswords("day2Input")
        );

        System.out.println(
                "Part two valid passwords: " +
                        new PasswordPhilosopherPartTwo().countValidPasswords("day2Input")
        );
    }
}
