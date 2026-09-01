package dosw.semana_3.estructural.ejercisio07Decorator;

public class BlindajeDecorator extends BarcoBaseDecorator{

    public BlindajeDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + ", con blindaje reforzado";
    }

    @Override
    public int defensa() {
        return barco.defensa() + 30;
    }
}
