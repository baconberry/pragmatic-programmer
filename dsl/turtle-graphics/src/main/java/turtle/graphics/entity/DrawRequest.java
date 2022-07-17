package turtle.graphics.entity;

import lombok.Builder;

@Builder
public record DrawRequest (
        String action,
        Integer argument
){

    public static DrawRequest of(String action, Integer argument){
        return new DrawRequest(action, argument);
    }
}
