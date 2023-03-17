package gangs.of.four.structural.facade.travel.boking;

public class TravelRoute {

    private Hotel hotel;
    private Flight flight;

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Hotel getHotel(){
        return hotel;
    }
}
