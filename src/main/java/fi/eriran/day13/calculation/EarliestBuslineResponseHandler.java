package fi.eriran.day13.calculation;

import fi.eriran.day13.pojo.EarliestBuslineResponse;

/**
 * Calculate the value requested in part one
 */
public class EarliestBuslineResponseHandler {

    public Integer handle(EarliestBuslineResponse response) {
        return response.getBuslineId() * response.getMinutesWaited();
    }
}
