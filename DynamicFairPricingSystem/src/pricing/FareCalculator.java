package pricing;

import model.RideDetails;

public interface FareCalculator {
    double calculateFare(RideDetails rideDetails);
}
