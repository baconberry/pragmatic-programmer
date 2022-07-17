package turtle.graphics.entity;

public record Line (
        Coordinates start,
        Coordinates end
){
    public static Line of(Coordinates start, Coordinates end){
        return new Line(start, end);
    }
}
