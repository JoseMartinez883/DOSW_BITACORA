package dosw.semana_3.estructural.ejercisio06Composite;

public class WharehouseApp {

    public static void main(String[] args){

        Product laptop = new Product("Laptop", 1200);
        Product mouse = new Product("Mouse", 40);
        Product keyboard = new Product("keyboard", 80);

        Box accesoriesBox = new Box("Accesories Box");
        accesoriesBox.add(mouse);
        accesoriesBox.add(keyboard);

        Box mainBox = new Box("Main Box");
        mainBox.add(laptop);
        mainBox.add(accesoriesBox);

        System.out.println("Total price: $" + mainBox.getPrice());
    }
}
