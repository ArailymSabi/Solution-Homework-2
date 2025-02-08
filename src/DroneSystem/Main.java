package DroneSystem;

public class Main {
    public static void main(String[] args) {
        CelestialBody earth = new Planet("Earth", 0, 0, "Oxygen");
        CelestialBody mars = new Planet("Mars", 100, 200, "Carbon Dioxide");

        Cargo cargo = new Cargo(20, "Food Supplies");

        Drone lightDrone = new LightDrone("L001", 50);
        Drone heavyDrone = new HeavyDrone("H001", 200);

        DeliveryTask task = new DeliveryTask(earth, mars, cargo);

        if (task.assignDrone(lightDrone)) {
            System.out.println("Для выполнения задачи назначен легкий дрон.");
        }

        System.out.println("Время полета (легкий дрон): " +
                lightDrone.calculateFlightTime(earth, mars) + " часов");
        task.completeTask();

        lightDrone.displayDetails();
        heavyDrone.displayDetails();
    }
}
