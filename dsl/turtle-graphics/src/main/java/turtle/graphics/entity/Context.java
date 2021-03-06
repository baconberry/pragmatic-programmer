package turtle.graphics.entity;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.Data;
import turtle.graphics.dsl.pen.Pen;

@Singleton
@Data
public class Context {

    @Inject
    private Canvas canvas;
    private Pen pen;
    private boolean isPenDown = false;
    private Coordinates currentCoordinates = Coordinates.of(0,0);

}
