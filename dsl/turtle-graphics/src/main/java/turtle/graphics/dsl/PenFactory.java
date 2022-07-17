package turtle.graphics.dsl;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import turtle.graphics.dsl.pen.Pen;

import java.util.List;
import java.util.Optional;

@Singleton
@RequiredArgsConstructor
public class PenFactory {

    private final List<Pen> pens;

    public Optional<Pen> findPen(int type){
        return pens.stream()
                .filter(pen -> pen.type() == type)
                .findAny();
    }
}
