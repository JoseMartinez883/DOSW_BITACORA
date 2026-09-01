package dosw.semana_4.decoratorCommandEjercicio10;

import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args){

        Editor canvas = new Editor(new BaseImage(new BufferedImage(20,20,3)));
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(new ApplySepiaCommand(canvas));
        invoker.executeCommand(new ApplyGrayscaleCommand(canvas));
        invoker.undo();
        invoker.undo();
    }
}
