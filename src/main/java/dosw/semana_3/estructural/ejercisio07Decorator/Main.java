package dosw.semana_3.estructural.ejercisio07Decorator;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args){

        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco,Barco>> mejoras = Map.of(
                "BLINDAJE", BlindajeDecorator::new,
                "RADAR", RadarDecorator::new,
                "MISILES", MisilesDecorator::new,
                "ANTITORPERDOS", AntiTorpedosDecorator::new
        );

        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        Barco barcoFinal = barcoBase;
        for (String clave : configuracion) {
            Function<Barco, Barco> decorador = mejoras.get(clave);
            if (decorador != null) {
                barcoFinal = decorador.apply(barcoFinal);
            }
        }

        System.out.println(barcoFinal.getDescription());
        System.out.println("Ataqueda: " + barcoFinal.poderAtaque());
        System.out.println("Defensas: " + barcoFinal.defensa());
    }
}
