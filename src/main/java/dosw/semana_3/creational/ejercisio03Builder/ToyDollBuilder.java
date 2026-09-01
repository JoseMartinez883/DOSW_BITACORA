package dosw.semana_3.creational.ejercisio03Builder;

public interface ToyDollBuilder {

    void builHead(String head);
    void buildBody(String body);
    void buildArms(String arms);
    void buildLegs(String legs);
    void hasAccesories(boolean hasAccesories);
}
