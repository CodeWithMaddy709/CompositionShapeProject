public class RectangleShape extends Shape implements AngleShape {
    private double length;
    private double width;
    public Circle circle1;

    public RectangleShape() {
        length = 0;
        width = 0;
        circle1 = new Circle();
        toString();
    }

    public RectangleShape(double l, double w) {
        circle1 = new Circle();
        setDimension(l, w);
    }

    public void setDimension(double l, double w) {
        if (l > 0)
            length = l;
        else
            length = 0;
        if (w > 0)
            width = w;
        else
            width = 0;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return ("Length = " + length + ", Width = " + width + ", Perimiter = " + perimeter() + ", area = " + area());
    }

    @Override
    public void printShapeInfo() {
        System.out.println("Length = " + length + ", Width = " + width + ", angle shape = " + angle);

    }

}
