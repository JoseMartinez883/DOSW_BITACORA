package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class Document {

    private String title;
    private String type;
    private String content;
    private DocumentState state;

    public Document(String title, String type, String content) {
        this.title = title;
        this.type = type;
        this.content = content;
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public String getTitle() { return title; }
    public String getType() { return type; }
    public String getContent() { return content; }
    public String getStateName() { return state.getStateName(); }

    @Override
    public String toString() {
        return "Documento{titulo='" + title + "', tipo='" + type + "', estado=" + state.getStateName() + "}";
    }
}
