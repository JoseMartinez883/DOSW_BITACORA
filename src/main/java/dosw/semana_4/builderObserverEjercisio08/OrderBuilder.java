package dosw.semana_4.builderObserverEjercisio08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderBuilder {

    private Size size = Size.MEDIUM; // default
    private Meat meat = Meat.BEEF;   // default
    private List<String> toppings = new ArrayList<>();
    private List<String> sides = new ArrayList<>();

    public OrderBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(Meat meat) {
        this.meat = meat;
        return this;
    }

    public OrderBuilder addTopping(String... newToppings) {
        this.toppings.addAll(Arrays.asList(newToppings));
        return this;
    }

    public OrderBuilder addSide(String... newSides) {
        this.sides.addAll(Arrays.asList(newSides));
        return this;
    }

    public Order build() {
        return new Order(size, meat, toppings, sides);
    }
}
