package dosw.semana_3.estructural.ejercisio05Bridge;

public abstract class Forma {

    protected Color color;

    public Forma(Color color){
        this.color = color;
    }

    public abstract void dibujar();
}
