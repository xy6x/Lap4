public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public  void calculateArea(){
        System.out.println(  (base * height)/2 );
    }
    public void  calculateCircumference(){
        System.out.println(base+height+height);
    }

}
