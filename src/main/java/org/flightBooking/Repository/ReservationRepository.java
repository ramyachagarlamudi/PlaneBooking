package org.flightBooking.Repository;

import org.flightBooking.Models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface ReservationRepository extends JpaRepository<Reservations, Integer> {

    @Modifying
    @Query(value = "Insert into reservation(passenger_id,sched_id,full_name,flight_name,source,destination,arrival_time,departure_time,departure_date,selected_class,price) values(:passenger_id,:sched_id,:full_name, :flight_name,:source,:destination,:arrival_time,:departure_time,:departure_date,:selected_class, :price)", nativeQuery=true)
    @Transactional
  void insertReservation(@Param ("passenger_id") int passengerId, @Param("sched_id") int sched_id,@Param ("full_name") String fullName, @Param ("flight_name") String flight_name ,@Param ("source") String source,@Param("destination") String destination, @Param ("arrival_time")String arrival_time,@Param ("departure_time")String departure_time,@Param ("departure_date") String departure_date, @Param ("selected_class") String selected_class,@Param ("price")double price);

    @Query(value = "SELECT r.reservation_code  FROM reservation r WHERE r.passenger_id=:passenger_id and r.full_name=:full_name ORDER BY r.reservation_code desc limit 1", nativeQuery = true)
    int findReservationId(@Param("passenger_id")int passenger_id, @Param("full_name")String full_name);


}
