package DroneSystem;

class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, double coordinateX, double coordinateY, int stationLevel) {
        super(name, coordinateX, coordinateY);
        this.stationLevel = stationLevel;
    }

    public int getStationLevel() {
        return stationLevel;
    }

    public void setStationLevel(int stationLevel) {
        this.stationLevel = stationLevel;
    }

    @Override
    public void displayDetails() {
        System.out.println("Space Station Name: " + getName() + ", Level: " + stationLevel);
    }
}
