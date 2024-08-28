import model.RideDetails;
import pricing.FareCalculator;
import strategy.PricingStrategyFactory;

public class FareService {
    public double calculateFare(RideDetails rideDetails) {
        FareCalculator fareCalculator = PricingStrategyFactory.getFareCalculator(rideDetails);
        return fareCalculator.calculateFare(rideDetails);
    }
}
