package fi.eriran._2020.day13.calculation.earliest;

import fi.eriran._2020.day13.pojo.EarliestBuslineResponse;

/**
 * Calculate the value requested in part one
 */
public class EarliestBuslineResponseHandler {

    public Integer handle(EarliestBuslineResponse response) {
        return response.getBuslineId() * response.getMinutesWaited();
    }
}
