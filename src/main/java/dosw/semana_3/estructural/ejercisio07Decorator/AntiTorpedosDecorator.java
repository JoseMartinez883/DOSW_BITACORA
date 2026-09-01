package dosw.semana_3.estructural.ejercisio07Decorator;

public class AntiTorpedosDecorator extends BarcoBaseDecorator{
    public AntiTorpedosDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + ", con sistema antitorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 20;
    }

}
