package turtle.graphics.dsl.command;

import jakarta.inject.Singleton;
import turtle.graphics.entity.Context;
import turtle.graphics.entity.DrawRequest;

@Singleton
public class PenUpCommand implements DrawCommand {
    @Override
    public void performAction(DrawRequest drawRequest, Context ctx) {
        ctx.setPenDown(false);
    }

    @Override
    public String commandName() {
        return "U";
    }
}
