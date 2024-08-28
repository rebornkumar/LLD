package model;

//factory method should be used for this.but for now keep it simple

public class RideDetails {
    private double distance;
    private int trafficLevel;
    private int demandLevel;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTrafficLevel() {
        return trafficLevel;
    }

    public void setTrafficLevel(int trafficLevel) {
        this.trafficLevel = trafficLevel;
    }

    public int getDemandLevel() {
        return demandLevel;
    }

    public void setDemandLevel(int demandLevel) {
        this.demandLevel = demandLevel;
    }
}
