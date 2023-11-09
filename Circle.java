public class Circle extends Shape{
     private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  void calculateArea(){
        System.out.println(radius*3.14*2);
    }
    public void  calculateCircumference(){
        System.out.println(radius*radius*3.14);
    }
}
