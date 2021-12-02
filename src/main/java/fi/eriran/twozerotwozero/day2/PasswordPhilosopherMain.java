package fi.eriran.twozerotwozero.day2;

import fi.eriran.twozerotwozero.day2.philosopher.PasswordPhilosopherPartOne;
import fi.eriran.twozerotwozero.day2.philosopher.PasswordPhilosopherPartTwo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordPhilosopherMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one valid passwords: " +
                        new PasswordPhilosopherPartOne().countValidPasswords("2020/day2Input")
        );

        logger.log(
                Level.INFO,
                () -> "Part two valid passwords: " +
                        new PasswordPhilosopherPartTwo().countValidPasswords("2020/day2Input")
        );
    }
}
