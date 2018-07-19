public class Main {

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom,
    }

    public static void main(String[] args) {
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {

            @Override
            float perimeter() {
                return (this.sides[0]+this.sides[1])*2;
            }

            @Override
            float area() {
                return this.sides[0]*this.sides[1];
            }
        };

        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2Sides) {

            @Override
            float perimeter() {
                return this.sides[0]*4;
            }

            @Override
            float area() {
                return this.sides[0]*this.sides[0];
            }
        };

        System.out.println("S2's perimeter is: " + s2.perimeter());
        System.out.println("S2's area is: " + s2.area());

        int[] s3Sides = {12};
        Shape s3=new Shape(ShapeType.Circle, s3Sides){

            @Override
            float perimeter() {
                return (float)(this.sides[0]*2*Math.PI);
            }

            @Override
            float area() {
                return (float)(this.sides[0]*this.sides[0]*Math.PI);
            }
        };

        System.out.println("S3's perimeter is: " + s3.perimeter());
        System.out.println("S3's area is: " + s3.area());

        int[] s4Sides = {8, 12, 12};
        Shape s4=new Shape(ShapeType.Triangle, s4Sides) {

            @Override
            float perimeter() {
                return this.sides[0]+this.sides[1]+this.sides[2];
            }

            @Override
            float area() {
                float s = perimeter()/2;
                return (float) Math.sqrt(s*(s-this.sides[0])*(s-this.sides[1])*(s-this.sides[2]));
            }
        };

        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4's area is: " + s4.area());
    }
}
