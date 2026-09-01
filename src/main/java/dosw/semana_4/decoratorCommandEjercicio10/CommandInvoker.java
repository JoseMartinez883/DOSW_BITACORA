package dosw.semana_4.decoratorCommandEjercicio10;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<ImageCommand> history = new Stack<>();

    public void executeCommand(ImageCommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            ImageCommand command = history.pop();
            command.undo();
        }
    }
}