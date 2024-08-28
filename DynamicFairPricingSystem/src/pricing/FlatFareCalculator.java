package pricing;

import model.RideDetails;
import pricing.FareCalculator;

public class FlatFareCalculator implements FareCalculator {
    private double ratePerKm;
    public FlatFareCalculator(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    @Override
    public double calculateFare(RideDetails rideDetails) {
        return ratePerKm * rideDetails.getDistance();

    }
}
