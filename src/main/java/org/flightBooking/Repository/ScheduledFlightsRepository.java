package org.flightBooking.Repository;
import org.flightBooking.Models.ScheduledFlights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ScheduledFlightsRepository extends JpaRepository<ScheduledFlights, Integer> {
    @Query(value = "SELECT * FROM scheduledflights s WHERE s.source = :source and s.destination = :destination", nativeQuery=true)
    List<ScheduledFlights> findBySourceAndDestination(@Param("source") String source, @Param("destination") String destination);
}
