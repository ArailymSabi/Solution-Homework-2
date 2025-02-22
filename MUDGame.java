package MUDGame;

import java.util.Scanner;

public class MUDGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем комнаты
        GameObject room1 = MUDGameEntityFactory.createRoom("Старинная комната", "Вы видите древние резные фигурки на стенах и ржавый ключ, лежащий в углу.");
        GameObject room2 = MUDGameEntityFactory.createRoom("Длинный коридор", "Вы открыли дверь и вошли в длинный коридор.");
        room1.setExit("north", room2);
        room2.setExit("south", room1);

        // Создаем NPC
        GameObject goblin = MUDGameEntityFactory.createNPC("Гоблин", "Маленький, но хитрый обитатель леса.");

        // Добавляем в комнату (если понадобится расширение)
        room1.setExit("east", goblin);

        // Создаем инвентарь и обработчик команд
        Inventory inventory = new Inventory();
        CommandHandler handler = new CommandHandler(room1, inventory);

        System.out.println("Добро пожаловать в Dungeon Quest!");
        handler.execute("look");

        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine().trim().toLowerCase();
            handler.execute(command);
        }
    }
}
