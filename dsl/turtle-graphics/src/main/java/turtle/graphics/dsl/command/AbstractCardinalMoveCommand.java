package turtle.graphics.dsl.command;

import turtle.graphics.entity.Context;
import turtle.graphics.entity.Coordinates;
import turtle.graphics.entity.DrawRequest;
import turtle.graphics.entity.Line;

public abstract class AbstractCardinalMoveCommand implements DrawCommand {
    @Override
    public void performAction(DrawRequest drawRequest, Context ctx) {
        var start = ctx.getCurrentCoordinates();
        var end = endFromStart(start, drawRequest.argument());
        ctx.getCanvas().drawLine(Line.of(start, end), ctx.getPen().color(), ctx.getPen().width());
        ctx.setCurrentCoordinates(end);
    }

    protected abstract Coordinates endFromStart(Coordinates start, int argument);

}
