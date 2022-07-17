package turtle.graphics.entity;

import lombok.Builder;

@Builder
public record DrawRequest (
        String action,
        Integer argument
){
}
