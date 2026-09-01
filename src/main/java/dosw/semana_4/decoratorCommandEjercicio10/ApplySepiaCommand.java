package dosw.semana_4.decoratorCommandEjercicio10;

public class ApplySepiaCommand implements ImageCommand{

    private final Editor editor;
    private Image previusImage;

    public ApplySepiaCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.previusImage= editor.getImage();
        editor.setImage(new SepiaDecorator(previusImage));
    }

    @Override
    public void undo() {
        editor.setImage(previusImage);
    }
}
