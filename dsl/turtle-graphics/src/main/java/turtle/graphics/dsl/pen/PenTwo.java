package turtle.graphics.dsl.pen;

import jakarta.inject.Singleton;
import lombok.ToString;
import turtle.graphics.entity.Color;

@Singleton
@ToString
public class PenTwo implements Pen {
    @Override
    public int type() {
        return 2;
    }

    @Override
    public int width() {
        return 2;
    }

    @Override
    public Color color() {
        return Color.BLUE;
    }
}
