package fi.eriran._2021.day3;

import fi.eriran._2021.day3.enums.EqualScenarioPreference;
import fi.eriran._2021.day3.enums.DegreePreference;

import java.util.List;

public class PowerConsumptionCalculator extends DiagnosticCalculator {

    public int calculate(List<String> lines) {
        int width = lines.get(0).length();

        String gammaRate = buildGammaRate(lines, width);
        String epsilonRate = buildEpsilonRate(gammaRate);
        int gammaRateInt = Integer.parseInt(gammaRate, 2);
        int epsilonRateInt = Integer.parseInt(epsilonRate, 2);
        return gammaRateInt * epsilonRateInt;
    }



    private String buildGammaRate(List<String> lines, int width) {
        StringBuilder gammaRateBuilder = new StringBuilder();
        for (int x = 0; x < width; x++) {
            gammaRateBuilder.append(findBit(lines, x, EqualScenarioPreference.ONE, DegreePreference.MOST));
        }
        return gammaRateBuilder.toString();
    }

    private String buildEpsilonRate(String gammaRate) {
        StringBuilder epsilonRateBuilder = new StringBuilder();
        for (char bit : gammaRate.toCharArray()) {
            switch (bit) {
                case '0':
                    epsilonRateBuilder.append('1');
                    break;
                case '1':
                    epsilonRateBuilder.append('0');
                    break;
                default:
                    throw new IllegalArgumentException("Unknown character encountered: " + bit);
            }
        }
        return epsilonRateBuilder.toString();
    }
}
