package turtle.graphics.entity;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Coordinates(int x, int y) {

    public Coordinates plusX(int add) {
        return withX(x() + add);
    }

    public Coordinates plusY(int add) {
        return withX(y() + add);
    }

    public static Coordinates of(int x, int y) {
        return builder().x(x).y(y).build();
    }
}
