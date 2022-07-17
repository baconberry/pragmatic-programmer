package turtle.graphics.dsl.pen;

import turtle.graphics.entity.Color;

public interface Pen {
    int type();
    int width();
    Color color();
}
