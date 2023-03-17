package gangs.of.four.structural.facade.travel.boking;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TravelFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    {
        hotelBooker = new HotelBooker();
        flightBooker = new FlightBooker();
    }

    public List<TravelRoute> getTravelRoutes(Date from, Date to){
        List<Flight> flights = flightBooker.getFlightsFor(from, to);
        List<Hotel> Hotels = hotelBooker.getHotelsFor(from, to);

        return Collections.emptyList();
    }

    public void bookTravelRoute(TravelRoute travelRoute){
        hotelBooker.bookHotel(travelRoute.getHotel());
        flightBooker.bookFlight(travelRoute.getFlight());
    }
}
