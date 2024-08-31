package strategy;

import model.RideDetails;
import pricing.FareCalculator;

public interface PricingStrategyFactory {
    FareCalculator getFareCalculator(RideDetails rideDetails);
}
