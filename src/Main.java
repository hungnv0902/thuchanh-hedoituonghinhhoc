public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(1);
        System.out.println(circle);

        circle = new Circle("red", false, 2);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("red", false, 3,4);
        System.out.println(rectangle);
    }

}
