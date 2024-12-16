
public class Main1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 5);
        Shape triangle = new Triangle(4, 6, 4, 5, 6);
        Shape circle = new Circle(7);
        System.out.println("Rectangle area: " + rectangle.area() + ", Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Triangle area: " + triangle.area() + ", Triangle perimeter: " + triangle.perimeter());
        System.out.println("Circle area: " + circle.area() + ", Circle perimeter: " + circle.perimeter());
    }
}
