package dosw.semana_4.decoratorCommandEjercicio10;

public class ApplyGrayscaleCommand implements ImageCommand {
    private final Editor editor;
    private Image previusImage;

    public ApplyGrayscaleCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.previusImage = editor.getImage();
        editor.setImage(new GrayscaleDecorator(previusImage));
    }

    @Override
    public void undo() {
        editor.setImage(previusImage);
    }
}
