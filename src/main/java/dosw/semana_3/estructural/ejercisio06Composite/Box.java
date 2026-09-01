package dosw.semana_3.estructural.ejercisio06Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item{

    private final String name;
    private List<Item> items;

    public Box(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void remove(Item item){
        items.remove(item);
    }




}
