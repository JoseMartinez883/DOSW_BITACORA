package dosw.semana_3.creational.ejercisio03Builder;

public class ToyDoll {

    private String head;
    private String body;
    private String arms;
    private String legs;
    private boolean hasAccesories;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void setHasAccesories(boolean hasAccesories) {
        this.hasAccesories = hasAccesories;
    }

    public String showInfo() {
        return "ToyDoll{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", arms='" + arms + '\'' +
                ", legs='" + legs + '\'' +
                ", hasAccesories=" + hasAccesories +
                '}';
    }
}
