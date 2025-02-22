package MUDGame;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public static boolean isValid(String direction) {
        for (Direction d : values()) {
            if (d.name().equalsIgnoreCase(direction)) {
                return true;
            }
        }
        return false;
    }
}

