package org.flightBooking.Models;

import java.util.List;

public class AjaxResponseBody {
        String msg;
        List<ScheduledFlights> result;

        public void setResult(List<ScheduledFlights> result) {
                this.result = result;
        }

        public List<ScheduledFlights> getResult() {
                return result;
        }

}
