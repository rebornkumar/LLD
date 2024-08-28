package pricing;

import model.RideDetails;
import pricing.FareCalculator;


public class SurgeFareCalculator implements FareCalculator {
    private double baseRate;
    private double surgeMultiplier;

    public SurgeFareCalculator(double baseRate, double surgeMultiplier) {
        this.baseRate = baseRate;
        this.surgeMultiplier = surgeMultiplier;
    }
    @Override
    public double calculateFare(RideDetails rideDetails) {
        return baseRate*rideDetails.getDistance()*surgeMultiplier;
    }
}
