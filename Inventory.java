package MUDGame;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println("Вы подбираете " + item + ".");
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("Ваш инвентарь пуст.");
        } else {
            System.out.println("Вы несете:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}

