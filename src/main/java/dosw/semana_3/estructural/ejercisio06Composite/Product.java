package dosw.semana_3.estructural.ejercisio06Composite;

public class Product implements Item{

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
