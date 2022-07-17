package turtle.graphics.controller;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import turtle.graphics.entity.DrawRequest;
import turtle.graphics.service.DrawService;

@Singleton
@RequiredArgsConstructor
public class InternalDSL {
    private final DrawService drawService;


    InternalDSL p(int penType){
        return command("P", penType);
    }

    InternalDSL d(){
        return command("D", null);
    }

    InternalDSL u(){
        return command("U", null);
    }

    InternalDSL w(int move){
        return command("W", move);
    }

    InternalDSL n(int move){
        return command("N", move);
    }

    InternalDSL e(int move){
        return command("E", move);
    }

    InternalDSL s(int move){
        return command("S", move);
    }

    private InternalDSL command(String action, Integer arg){
        drawService.draw(DrawRequest.of(action, arg));
        return this;
    }
}
