package org.flightBooking.Repository;

import org.flightBooking.Models.ScheduledFlights;
import org.flightBooking.Models.ScheduledFlightsTravelClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduledTravelClassRepository extends JpaRepository<ScheduledFlightsTravelClass, Integer> {
    @Query(value = "SELECT price FROM scheduledflighttravelclass ts WHERE ts.travel_class = :selectedClass and ts.schedflight_id = :schedflight_id and ts.noofseats >= :noOfPassengers", nativeQuery=true)
   int findPriceForAvaliable(@Param("schedflight_id") int schedflight_id, @Param("selectedClass") String selectedClass, @Param("noOfPassengers") int noOfPassengers);


}
