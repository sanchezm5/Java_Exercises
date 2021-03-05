package abstractClass;

public class Triangle extends Shape {

    @Override
    public double printArea() {
        return 0.5 * (x * y);
    }
}
