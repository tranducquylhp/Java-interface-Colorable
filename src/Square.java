public class Square extends Rectangle implements Colorable{
    public Square() {

    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean fill, double size) {
        super(color, fill, size, size);
    }

    public double getSize() {
        return getHeight();
    }

    public void setSize(double size) {
        setHeight(size);
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        return "A Square with side=" + this.getSize() + ", which is a subclass of " + super.toString()+".";
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
}
