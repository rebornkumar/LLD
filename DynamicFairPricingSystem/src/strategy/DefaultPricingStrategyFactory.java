package strategy;

import model.RideDetails;
import pricing.FareCalculator;
import pricing.FlatFareCalculator;
import pricing.SurgeFareCalculator;

//we can have multiple Pricing strategy as well!!
public class DefaultPricingStrategyFactory implements PricingStrategyFactory{
    public FareCalculator getFareCalculator(RideDetails rideDetails) {
        if(rideDetails.getDemandLevel() < 7) {
            return new FlatFareCalculator(8);
        }else {
            return new SurgeFareCalculator(10,2.5);
        }
    }
}
