abstract class Shape {
    Main.ShapeType type;
    int[] sides;

    Shape(Main.ShapeType type, int[] sides) {
        this.type = type;
        this.sides = sides;
    }
    abstract float perimeter();
    abstract float area();
}
