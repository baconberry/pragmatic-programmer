package turtle.graphics.dsl.command;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import turtle.graphics.dsl.PenFactory;
import turtle.graphics.entity.Context;
import turtle.graphics.entity.DrawRequest;
import turtle.graphics.dsl.command.DrawCommand;

@Singleton
@RequiredArgsConstructor
@Slf4j
public class SelectPenCommand implements DrawCommand {

    private final PenFactory penFactory;

    @Override
    public void performAction(DrawRequest drawRequest, Context ctx) {
        log.debug("Selecting peng for request [{}]", drawRequest);
        penFactory.findPen(drawRequest.argument())
                .ifPresent(pen -> {
                    log.info("Got pen [{}]", pen);
                    ctx.setPen(pen);
                });
    }

    @Override
    public String commandName() {
        return "P";
    }
}
