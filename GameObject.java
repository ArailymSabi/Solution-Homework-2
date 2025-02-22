package MUDGame;

import java.util.HashMap;
import java.util.Map;

public class GameObject {
    private String name;
    private String description;
    private Map<String, GameObject> exits = new HashMap<>();

    public GameObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setExit(String direction, GameObject room) {
        exits.put(direction, room);
    }

    public GameObject getExit(String direction) {
        return exits.get(direction);
    }

    public void describe() {
        System.out.println(name + ": " + description);
        if (!exits.isEmpty()) {
            System.out.println("Выходы: " + String.join(", ", exits.keySet()));
        }
    }
}
