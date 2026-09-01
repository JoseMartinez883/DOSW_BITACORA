package dosw.semana_3.estructural.ejercisio07Decorator;

public class BarcoBaseDecorator implements Barco{

    protected Barco barco;

    public BarcoBaseDecorator(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String getDescription() {
        return barco.getDescription();
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
