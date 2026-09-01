package dosw.semana_3.estructural.ejercisio07Decorator;

public class RadarDecorator extends BarcoBaseDecorator{
    public RadarDecorator(Barco barco) {
        super(barco);
    }


    @Override
    public String getDescription() {
        return barco.getDescription() + ", con radar";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 10;
    }

}
