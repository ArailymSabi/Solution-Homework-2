class LightDrone extends Drone {
    private static final double SPEED = 50.0;

    public LightDrone(String id, double cargoCapacity) {
        super(id, cargoCapacity);
    }

    @Override
    public double calculateFlightTime(CelestialBody origin, CelestialBody destination) {
        double distance = Math.sqrt(Math.pow(destination.getCoordinateX() - origin.getCoordinateX(), 2) +
                Math.pow(destination.getCoordinateY() - origin.getCoordinateY(), 2));
        return distance / SPEED;
    }

    @Override
    public void displayDetails() {
        System.out.println("Light Drone ID: " + getId() + ", Status: " + getStatus() + ", Cargo Capacity: " + getCargoCapacity());
    }
}
