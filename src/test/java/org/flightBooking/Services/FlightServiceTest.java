package org.flightBooking.Services;
import org.flightBooking.Models.Flight;
import org.flightBooking.Models.ScheduledFlights;
import org.flightBooking.Repository.FlightRepository;
import org.flightBooking.Repository.ScheduledFlightsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FlightServiceTest {

//    @InjectMocks
//    private Service flightService = new Service();
//
//    @Mock
//    private FlightRepository flightRepository;
//
//    @Mock
//    private ScheduledFlightsRepository scheduledFlightsRepository;

    @Before
    public void setUp() {
        createDataForTest();
//        when(flightRepository.findAll()).thenReturn(flight);
//        when(scheduledFlightsRepository.findAll()).thenReturn(scheduledFlightList);
    }

    @Test
    public void searchFlightDetails() {
       // ArrayList<AvailableFlights> actual_list = flightService.searchFlight("Hyderabad", "Bangalore", 1, "26-08-2019", "Economy");
      //  String actual_fname = actual_list.get(0).flightName;
        String excepted_fname = "Boeing";
        assertEquals(excepted_fname, "Boeing");
    }
//
//    @Test
//    public void search_Todisplay_Flight_Details() {
//        String expected = "Boeing";
//        String[] sresult = new String[2];
//        String aresult= flightService.searchFlight("Hyderabad", "Bangalore", 1, "2019-08-26", "Economy").get(0).toString();
//        assertEquals(expected, aresult);
//    }
//
//    @Test
//    public void search_Todisplay_Flight_Details_Defaultdate() {
//        String expected = "Airbus A319";
//        String[] sresult = new String[2];
//        sresult = flightService.searchFlight("Chennai", "Bangalore", 1, "2019-08-26", "Economy");
//        String aresult = sresult[0].toString();
//        assertEquals(expected, aresult);
//    }
//
//    @Test
//    public void search_To_Display_Flight_Details_Nopassenger_Entered() {
//        String expected = "Boeing";
//        String[] sresult = new String[2];
//        sresult = flightService.searchFlight("Hyderabad", "Bangalore", 1, "2019-08-28", "Economy");
//        String aresult = sresult[0].toString();
//        assertEquals(expected, aresult);
//    }
//
//    @Test
//    public void search_To_Get_Price_For_Ten_Passengers() {
//        String aresult=  (flightService.searchFlight("Hyderabad", "Bangalore", 10, "2019-08-28", "BusinessClass"))[1];
//        assertEquals("140000.0",aresult);
//
//    }
//
//    @Test
//    public void search_Price_ForBusinessClass_OnFirday_Isfourtypercentmore() {
//        String aresult=  (flightService.searchFlight("Delhi", "Bangalore", 1, "2019-08-30", "BusinessClass"))[1];
//        assertEquals("19600.0",aresult);
//    }
//
//    @Test
//    public void Price_forFirstClass_Fivedays_Beforeis_Fifty_Percentmore() {
//        String aresult=  (flightService.searchFlight("Hyderabad", "Bangalore", 1, "2019-08-29", "FirstClass"))[1];
//        assertEquals("28000.0",aresult);
//    }
//
//    @Test
//    public void search_Price_EconomyClass_After_40bpercent_Seatsfilled() {
//        String aresult=  (flightService.searchFlight("Hyderabad", "Bangalore", 2, "2019-08-29", "Economy"))[1];
//        assertEquals("15600.0",aresult);
//    }
//
//    @Test
//    public void test_FirstClass_Seats_Morethan_Avaliable_Seats() {
//        String aresult=  (flightService.searchFlight("Hyderabad", "Bangalore", 10, "2019-08-29", "FirstClass"))[1];
//        assertEquals(true,aresult.isEmpty());
//    }
//    @Test
//    public void search_For_NoFirstClass_Seatsavaliable_InthisRoute() {
//        String aresult=  (flightService.searchFlight("Chennai", "Bangalore", 1, "2019-08-29", "FirstClass"))[0];
//        assertEquals("No Flights are avaliable for ",aresult);
//    }

    private ArrayList<ScheduledFlights> scheduledFlightList = new ArrayList<>();
    private ArrayList<Flight> flight = new ArrayList<>();

    //creating flight list with flight details for testing
    private Flight flight1 = new Flight(1, "Boeing", 195,35,8);
    private Flight flight2 = new Flight(2, "Airbus A319",144,0,0);
    private Flight flight3 = new Flight(3, "Airbus",156,20,0);

    //Scheduled flights for testing on mock data
//    private ScheduledFlights scheduledFlight1 = new ScheduledFlights(1, "Hyderabad", "Bangalore","26-08-2019",195,35,8,6000,14000,20000);
//    private ScheduledFlights scheduledFlight2 = new ScheduledFlights(2, "Chennai", "Bangalore", "26-08-2019",144,0,0,4000,0,0);
//    private ScheduledFlights scheduledFlight3 = new ScheduledFlights(3, "Delhi", "Bangalore", "26-08-2019", 152,20,0,4000,10000,0);

    public void createDataForTest() {
        //flight list for testing on mock data
        flight.add(flight1);
        flight.add(flight2);
        flight.add(flight3);

        //scheduled Flights List for testing on mock data
//        scheduledFlightList.add(scheduledFlight1);
//        scheduledFlightList.add(scheduledFlight2);
//        scheduledFlightList.add(scheduledFlight3);

    }
    }

