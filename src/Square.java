public class Square extends Rectangle {
    private double side = 1;

    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return getWidth()
    }



    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHight(double hight) {
        setSide(hight);
    }
}
