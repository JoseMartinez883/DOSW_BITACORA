package dosw.semana_2.pokemon;

import java.text.DecimalFormat;
import java.util.stream.Stream;

public class Ejercisio11 {

    public static void main(String[] args){

        DecimalFormat db = new DecimalFormat("#,##0.##");

        String powerCombat = "PC: [320, 680, 530, 210, 495, 610]";
        powerCombat = powerCombat.replace("PC:","")
                .replace("[","").replace("]","")
                .trim();

        double powerCombatAverage = Stream.of(powerCombat.split(","))
                .mapToDouble(Double::parseDouble)
                .average().orElse(0.0);

        System.out.printf("Poder de combate promedio: " + db.format(powerCombatAverage));

    }
}
