package dosw.semana_3.estructural.ejercisio05Bridge;

public class Circulo extends Forma{

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de color " + color.toString());
    }
}
