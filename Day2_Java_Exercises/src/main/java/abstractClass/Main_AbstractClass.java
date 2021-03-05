/**
 *  Write a Java Program to create an abstract class named Shape that contains two integers and an empty method named
 *  printArea. Provide three classes named Rectangle, Triangle, and Circle subclass that each one of the classes extends
 *  the Class Shape. Each one of the classes contains only the method printArea() that prints the area of Shape.
 */

package abstractClass;

public class Main_AbstractClass {

    public static void main(String[] args) {
        System.out.println("This is the main class for the Abstract Class Assignment (Day 2)");

        // Area for Circle
        Circle circle = new Circle();
        circle.x = 4;
        System.out.println("The area for this circle is: " + circle.printArea());

        // Area for Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 3;
        System.out.println("The area for this rectangle is: " + rectangle.printArea());

        // Area for triangle;
        Triangle triangle = new Triangle();
        triangle.x = 3;
        triangle.y = 2;
        System.out.println("The area for this triangle is: " + triangle.printArea());
    }
}
