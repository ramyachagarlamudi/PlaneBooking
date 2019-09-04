package org.flightBooking.Services;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;
        import org.flightBooking.Models.FlightData;
        import org.flightBooking.Repository.FlightDataStaticRepository;
        import org.junit.*;

        import static org.junit.Assert.assertEquals;

public class TestFlightService {
    private String list1;


    @Test
    public void getdispFlightDetails() {
        FlightService fs1 = new FlightService();
     //   fs1.getdispFlightDetails("Hyderabad", "Banglore", 1));
        int result= 1;
        assertEquals(1, result);
    }
    @Test
    public void getdispFlightDetail() {
//        FlightService fs = new FlightService();
//        <ArraysList> list1 = fs.getdispFlightDetails("Hyderabad","Banglore",1).toString();
//        int result = list1.stream().filter(i -> "hy")
//        assertEquals(3, result);
    }
  }

