package DroneSystem;

class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, double coordinateX, double coordinateY, String atmosphereType) {
        super(name, coordinateX, coordinateY);
        this.atmosphereType = atmosphereType;
    }
    public String getAtmosphereType() {
        return atmosphereType;
    }
    public void setAtmosphereType(String atmosphereType) {
        this.atmosphereType = atmosphereType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Planet Name: " + getName() + ", Atmosphere: " + atmosphereType);
    }
}
