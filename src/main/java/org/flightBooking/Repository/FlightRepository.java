package org.flightBooking.Repository;
import org.flightBooking.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
    @Query(value = "SELECT flight_name FROM flight f WHERE f.flight_id=:flight_id", nativeQuery=true)
    String findFlightName(@Param("flight_id") int flight_id);
}
