package hw_6_2.task_1;

public class PerimeterArea {
    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure triangle = new Triangle(7,8,4,4,6);
        Figure circle = new Circle(9);


        figureDetails("Square", square);
        figureDetails("Triangle", triangle);
        figureDetails("Circle", circle);
    }
    private static void figureDetails(String name, Figure figure) {
        System.out.println("--- " + name + " ---");
        System.out.println("Object: " + figure.toString());
        System.out.println("Area: " + figure.getArea());
        System.out.println("Perimeter: " + figure.getPerimeter());
    }
}
