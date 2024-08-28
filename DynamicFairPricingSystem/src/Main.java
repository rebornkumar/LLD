import model.RideDetails;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RideDetails rideDetailsUser1 = new RideDetails();
        rideDetailsUser1.setDistance(100);
        rideDetailsUser1.setDemandLevel(5);
        rideDetailsUser1.setTrafficLevel(5);
        FareService fareService = new FareService();
        double fare = fareService.calculateFare(rideDetailsUser1);
        System.out.println("Calculated Fare: $" + fare);
    }
}