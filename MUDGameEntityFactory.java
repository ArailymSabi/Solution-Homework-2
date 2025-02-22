package MUDGame;


public class MUDGameEntityFactory {
    public static GameObject createRoom(String name, String description) {
        return new GameObject(name, description);
    }

    public static GameObject createNPC(String name, String description) {
        return new GameObject(name, description);
    }
}

