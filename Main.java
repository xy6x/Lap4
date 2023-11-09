public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 5);
        System.out.println(" The perimeter area of the square is:  ");
        r1.calculateCircumference();
        System.out.println("The area of the square is:");
        r1.calculateArea();
        //2
        Circle c1 = new Circle(3);
        System.out.println(" The area of the circumference of a circle is  ");
        c1.calculateArea();
        System.out.println("The area of the circle is");
        c1.calculateCircumference();
        Triangle t1 = new Triangle(3, 4);
        System.out.println(" The area of the perimeter of the triangle is  ");
        t1.calculateCircumference();
       t1.calculateCircumference();
        System.out.println("The area of the triangle is: ");
        t1.calculateArea();

    }
}