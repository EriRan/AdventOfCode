package fi.eriran.day1;

import com.google.common.io.Resources;

import java.io.IOException;

public class ReportRepairMain {

    public static void main(String[] args) throws IOException {
        System.out.println(
                new ReportRepair().repair(new InputParser().parse(Resources.getResource("day1Input")))
        );
    }
}
