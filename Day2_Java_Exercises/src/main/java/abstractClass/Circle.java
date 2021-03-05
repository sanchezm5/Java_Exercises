package abstractClass;

public class Circle extends Shape {

    @Override
    public double printArea() {
        return Math.PI * x * x;
    }
}
