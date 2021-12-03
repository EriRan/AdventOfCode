package fi.eriran._2021.day3;

import java.util.List;

public class RateCalculator {

    public int calculate(List<String> input) {
        int width = input.get(0).length();

        String gammaRate = buildGammaRate(input, width);
        String epsilonRate = buildEpsilonRate(gammaRate);
        int gammaRateInt = Integer.parseInt(gammaRate, 2);
        int epsilonRateInt = Integer.parseInt(epsilonRate, 2);
        return gammaRateInt * epsilonRateInt;
    }



    private String buildGammaRate(List<String> input, int width) {
        StringBuilder gammaRateBuilder = new StringBuilder();
        for (int x = 0; x < width; x++) {
            int zeroes = 0;
            int ones = 0;
            for (String oneLine : input) {
                char bit = oneLine.charAt(x);
                switch (bit) {
                    case '0':
                        zeroes++;
                        break;
                    case '1':
                        ones++;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown character encountered: " + bit);
                }
            }
            // I guess the amount of zeroes and ones can't be equal
            if (zeroes > ones) {
                gammaRateBuilder.append('0');
            } else {
                gammaRateBuilder.append('1');
            }
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
