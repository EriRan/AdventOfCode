package fi.eriran.day2;

import com.google.common.io.Resources;

import java.io.IOException;

public class PasswordPhilosopherMain {

    public static void main(String[] args) throws IOException {
        System.out.println(
                "Part one valid passwords: " +
                new PasswordPhilosopherPartOne().countValidPasswords(Resources.getResource("day2Input"))
        );

        System.out.println(
                "Part two valid passwords: " +
                        new PasswordPhilosopherPartTwo().countValidPasswords(Resources.getResource("day2Input"))
        );
    }
}
