public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 4);
        shapes[2] = new Square(3);
        shapes[3] = new Rectangle("orange", true, 8, 7);
        shapes[4] = new Square("blue",true,6);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.print(square+" ");
                square.howToColor();
            }
        }
    }
}
