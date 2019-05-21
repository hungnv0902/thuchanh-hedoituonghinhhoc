public class Circle extends Shape {
    private double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    @Override

    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                +super.toString();
    }
}
