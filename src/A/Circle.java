package A;

public class Circle {
    private double radius;
    private String color;
    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    Circle(double r){
        this.radius = r;
        this.color = "red";
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
}
class Test{
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
    }
}