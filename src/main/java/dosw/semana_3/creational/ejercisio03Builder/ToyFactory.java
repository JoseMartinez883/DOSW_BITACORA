package dosw.semana_3.creational.ejercisio03Builder;

public class ToyFactory {


    public void constructDoll(ToyDollBuilder builder){
        builder.builHead("Cabeza de plástico resistente");
        builder.buildBody("Cuerpo articulado");
        builder.buildArms("Brazos movibles");
        builder.buildLegs("Piernas con articulaciones");
        builder.hasAccesories(true);
    }
}
