package turtle.graphics.dsl.command;

import jakarta.inject.Singleton;
import turtle.graphics.entity.Context;
import turtle.graphics.entity.DrawRequest;

@Singleton
public class PenDownCommand implements DrawCommand {
    @Override
    public void performAction(DrawRequest drawRequest, Context ctx) {
        ctx.setPenDown(true);
    }

    @Override
    public String commandName() {
        return "D";
    }
}
