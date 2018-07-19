import java.util.Objects;

public class Main {

    static class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape) {
            if(!Objects.equals(shape.type, ShapeType.Custom)) {
                System.out.println("The perimeter is: " + shape.perimeter());
                System.out.println("The area is: " + shape.area());
            } else {
                System.out.println("The perimeter is: " + shape.perimeter());
            }
        }
    }

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom,
    }

    public static void main(String[] args) {
        MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10,20};
        ShapeType s1Type = ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape(s1Type, s1Sides) {

            @Override
            float perimeter() {
                return (this.sides[0]+this.sides[1])*2;
            }

            @Override
            float area() {
                return this.sides[0]*this.sides[1];
            }
        });

        int[] s2Sides = {10};
        ShapeType s2Type = ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape(s2Type, s2Sides) {

            @Override
            float perimeter() {
                return this.sides[0]*4;
            }

            @Override
            float area() {
                return this.sides[0]*this.sides[0];
            }
        });

        int[] s3Sides = {12};
        ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(s3Type, s3Sides) {

            @Override
            float perimeter() {
                return (float)(this.sides[0]*2*Math.PI);
            }

            @Override
            float area() {
                return (float)(this.sides[0]*this.sides[0]*Math.PI);
            }
        });

        int[] s4Sides = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
        mg.calculateAreaAndPerimeter(new Shape(s4Type, s4Sides) {
            @Override
            float perimeter() {
                return this.sides[0]+this.sides[1]+this.sides[2];
            }

            @Override
            float area() {
                return 0;
            }
        });
    }
}
