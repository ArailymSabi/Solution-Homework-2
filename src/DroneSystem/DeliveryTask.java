package DroneSystem;

class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    // Метод для назначения дрона
    public boolean assignDrone(Drone drone) {
        if (drone.assignCargo(cargo)) {
            this.assignedDrone = drone;
            drone.setStatus("IN_FLIGHT");
            return true;
        }
        return false;
    }

    // Метод для завершения задания
    public void completeTask() {
        if (assignedDrone != null) {
            assignedDrone.setStatus("IDLE");
            System.out.println("Доставка выполнена дроном " + assignedDrone.getId());
        } else {
            System.out.println("Для этой задачи дрон не назначен.");
        }
    }
}
