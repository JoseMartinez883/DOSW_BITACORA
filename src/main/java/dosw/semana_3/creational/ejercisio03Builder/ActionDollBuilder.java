package dosw.semana_3.creational.ejercisio03Builder;

public class ActionDollBuilder implements ToyDollBuilder{

    private String head;
    private String body;
    private String arms;
    private String legs;
    private boolean hasAccesories;

    private ToyDoll doll;

    @Override
    public void builHead(String head) {
        this.head = head;
    }

    @Override
    public void buildBody(String body) {
        this.body = body;
    }

    @Override
    public void buildArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void buildLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void hasAccesories(boolean hasAccesories) {
        this.hasAccesories = hasAccesories;
    }

    public ToyDoll getResult(){
        doll = new ToyDoll();
        doll.setArms(arms);
        doll.setHasAccesories(hasAccesories);
        doll.setBody(body);
        doll.setHead(head);
        doll.setLegs(legs);
        return doll;
    }
}
