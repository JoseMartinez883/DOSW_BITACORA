package dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.Collectors;

class ReportePokemon {
    private String nombreMayuscula;
    private String region;
    private double poderCombate;

    public ReportePokemon(String nombreMayuscula, String region, double poderCombate) {
        this.nombreMayuscula = nombreMayuscula;
        this.region = region;
        this.poderCombate = poderCombate;
    }

    public String getNombreMayuscula() { return nombreMayuscula; }
    public String getRegion() { return region; }
    public double getPoderCombate() { return poderCombate; }
}

public class RetoMewtwo {

    public static Map<String, Optional<ReportePokemon>> generarReporteElite(List<Pokemon> listaPokemones) {
        return listaPokemones.stream()
                .filter(p -> p.getNivel() > 50)

                // modificando el nombre a mayúsculas y proyectando solo los datos necesarios.
                .map(p -> new ReportePokemon(
                        p.getNombre().toUpperCase(),
                        p.getRegion(),
                        p.getPoderCombate()
                ))

                .sorted(Comparator.comparingDouble(ReportePokemon::getPoderCombate).reversed())

                .collect(Collectors.groupingBy(
                        ReportePokemon::getRegion,
                        Collectors.reducing((r1, r2) -> r1.getPoderCombate() > r2.getPoderCombate() ? r1 : r2)
                ));
    }

    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Mewtwo", "Psíquico", 85, 680.0, "Kanto", true),
                new Pokemon(2L, "Charizard", "Fuego", 75, 610.0, "Kanto", false),
                new Pokemon(3L, "Pikachu", "Eléctrico", 45, 320.0, "Kanto", false),
                new Pokemon(4L, "Typhlosion", "Fuego", 70, 540.0, "Johto", false),
                new Pokemon(5L, "Feraligatr", "Agua", 68, 520.0, "Johto", false),
                new Pokemon(6L, "Blaziken", "Fuego", 80, 590.0, "Hoenn", false)
        );

        Map<String, Optional<ReportePokemon>> resultado = generarReporteElite(equipo);

        System.out.println("=== REPORTE TÁCTICO DE ÉLITE (RETO MEWTWO) ===");
        resultado.forEach((region, reporteOpt) -> {
            reporteOpt.ifPresent(r ->
                    System.out.println("Región: " + region + " ➔ Campeón: " + r.getNombreMayuscula() + " [PC: " + r.getPoderCombate() + "]")
            );
        });
    }
}
