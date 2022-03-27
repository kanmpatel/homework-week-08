package cylinder;
//parent class
public class Circle {
    //instance variable
    double radius;
    //constructo use to initized value
    public Circle(double radius){
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    //this method get the value of radius
    public double getRadius() {
        return radius;
    }
    //this method calculate area of circle using Math.PI * radius * radius
    public double getArea(){
        return Math.PI * radius * radius;
    }

}
