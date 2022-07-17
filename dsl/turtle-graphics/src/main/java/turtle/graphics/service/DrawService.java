package turtle.graphics.service;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import turtle.graphics.dsl.DrawCommandFactory;
import turtle.graphics.entity.Canvas;
import turtle.graphics.entity.Context;
import turtle.graphics.entity.DrawRequest;

@Singleton
@RequiredArgsConstructor
@Slf4j
public class DrawService {

    private final DrawCommandFactory drawCommandFactory;
    private final Context ctx;

    public void draw(DrawRequest request){
        drawCommandFactory.findCommand(request.action())
                .ifPresentOrElse(command ->{
                    command.performAction(request, ctx);
                }, ()->{
                    log.warn("Could not find command for DrawRequest [{}]", request);
                });
    }
}
