package strategy;

import model.RideDetails;
import pricing.FareCalculator;
import pricing.FlatFareCalculator;
import pricing.SurgeFareCalculator;

public class AggresivePricingStrategyFactory implements PricingStrategyFactory {
    @Override
    public FareCalculator getFareCalculator(RideDetails rideDetails) {
        if(rideDetails.getDemandLevel() < 5) {
            return new FlatFareCalculator(80);
        }else {
            return new SurgeFareCalculator(100,25);
        }
    }
}
