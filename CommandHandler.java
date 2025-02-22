package MUDGame;

public class CommandHandler {
    private GameObject currentRoom;
    private final Inventory inventory;

    public CommandHandler(GameObject startRoom, Inventory inventory) {
        this.currentRoom = startRoom;
        this.inventory = inventory;
    }

    public void execute(String command) {
        if (command.equals("look")) {
            currentRoom.describe();
        } else if (command.startsWith("go ")) {
            move(command.substring(3));
        } else if (command.equals("inventory")) {
            inventory.showInventory();
        } else if (command.startsWith("pick up ")) {
            inventory.addItem(command.substring(8));
        } else if (command.startsWith("use ")) {
            System.out.println("Вы используете " + command.substring(4) + ".");
        } else if (command.startsWith("say ")) {
            System.out.println("[Вы]: " + command.substring(4));
        } else if (command.equals("help")) {
            showHelp();
        } else if (command.equals("exit")) {
            System.out.println("Вы вышли из игры.");
            System.exit(0);
        } else {
            System.out.println("Неизвестная команда. Введите 'help' для справки.");
        }
    }

    private void move(String direction) {
        if (Direction.isValid(direction)) {
            GameObject nextRoom = currentRoom.getExit(direction);
            if (nextRoom != null) {
                currentRoom = nextRoom;
                currentRoom.describe();
            } else {
                System.out.println("Вы не можете идти в этом направлении.");
            }
        } else {
            System.out.println("Некорректное направление.");
        }
    }

    private void showHelp() {
        System.out.println("Доступные команды:");
        System.out.println("- look : Опишите свое окружение.");
        System.out.println("- go <direction>: Двигайтесь в указанном направлении (north, south, east, west).");
        System.out.println("- inventory : Проверьте свои переносимые предметы.");
        System.out.println("- pick up <item>: Поднимите предмет.");
        System.out.println("- use <item> : Использовать предмет из вашего инвентаря.");
        System.out.println("- say <message> : Отправить сообщение ближайшим игрокам.");
        System.out.println("- help : Отобразить это сообщение справки.");
        System.out.println("- exit : Выйти из игры.");
    }
}

