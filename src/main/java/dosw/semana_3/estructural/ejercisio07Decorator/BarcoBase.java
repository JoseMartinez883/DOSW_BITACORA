package dosw.semana_3.estructural.ejercisio07Decorator;

public class BarcoBase implements Barco{

    @Override
    public String getDescription() {
        return "Barco";
    }

    @Override
    public int poderAtaque() {
        return 0;
    }

    @Override
    public int defensa() {
        return 0;
    }
}
