import model.RideDetails;
import pricing.FareCalculator;
import strategy.DefaultPricingStrategyFactory;
import strategy.PricingStrategyFactory;

public class FareService {

    PricingStrategyFactory pricingStrategyFactory = new DefaultPricingStrategyFactory();
    public double calculateFare(RideDetails rideDetails) {
        FareCalculator fareCalculator = pricingStrategyFactory.getFareCalculator(rideDetails);
        return fareCalculator.calculateFare(rideDetails);
    }
}
