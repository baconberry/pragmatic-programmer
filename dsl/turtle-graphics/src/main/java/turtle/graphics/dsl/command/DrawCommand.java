package turtle.graphics.dsl.command;

import turtle.graphics.entity.Context;
import turtle.graphics.entity.DrawRequest;

public interface DrawCommand {
    void performAction(DrawRequest drawRequest, Context ctx);
    String commandName();
}
