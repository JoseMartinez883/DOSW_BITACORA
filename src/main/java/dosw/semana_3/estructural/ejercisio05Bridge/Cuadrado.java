package dosw.semana_3.estructural.ejercisio05Bridge;

public class Cuadrado extends Forma{
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + color.toString());
    }
}
