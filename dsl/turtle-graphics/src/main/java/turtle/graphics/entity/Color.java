package turtle.graphics.entity;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Builder
public record Color (
        int red,
        int green,
        int blue
){
    public static final Color BLUE = new Color(0,0,0xff);
}
