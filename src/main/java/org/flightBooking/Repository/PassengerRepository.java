package org.flightBooking.Repository;
import org.flightBooking.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    @Modifying
    @Query(value = "Insert into passenger(full_name, email, mobile_number, address) values(:full_name, :email, :mobile_number, :address)", nativeQuery=true)
    @Transactional
    void insertPassenger(@Param("full_name") String full_name, @Param("email") String email, @Param("mobile_number") String mobile_number,@Param("address")String address);

    @Query(value = "SELECT * FROM passenger p WHERE p.full_name=:full_name and p.email=:email", nativeQuery=true)
    Passenger getPassenger(@Param("full_name") String full_name, @Param("email") String email);
}
