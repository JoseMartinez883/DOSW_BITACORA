package dosw.semana_3.estructural.ejercisio07Decorator;

public class MisilesDecorator  extends BarcoBaseDecorator{
    public MisilesDecorator(Barco barco) {
        super(barco);
    }


    @Override
    public String getDescription() {
        return barco.getDescription() + ", con misiles";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 40;
    }

}
