abstract class Drone {
    private String id;
    private String status;
    private double cargoCapacity;
    private double currentCargoWeight;

    public Drone(String id, double cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public void setCurrentCargoWeight(double currentCargoWeight) {
        this.currentCargoWeight = currentCargoWeight;
    }

    public abstract double calculateFlightTime(CelestialBody origin, CelestialBody destination);

    public boolean assignCargo(Cargo cargo) {
        if (cargo.getWeight() + currentCargoWeight <= cargoCapacity) {
            currentCargoWeight += cargo.getWeight();
            return true;
        }
        return false;
    }
    public abstract void displayDetails();
}
