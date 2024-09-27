public class Circle {

    private static double radius = 1;
    private static double diameter;
    private static double area;

    public Circle() {
        calculateDiameter();
        calculateArea();
    }

    public void setRadius(double rad) {
        radius = rad;
        calculateDiameter();
        calculateArea();
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }

    private void calculateDiameter() {
        diameter = 2 * radius;
    }

    private void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());

        circle.setRadius(5);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
} 
