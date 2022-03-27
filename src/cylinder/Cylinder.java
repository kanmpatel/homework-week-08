package cylinder;
//child of circle
public class Cylinder extends Circle {
    double height;
    //this concstrutor used to initilzed the value
    public Cylinder(double radius,double height){
        super(radius);
        if(height < 0){
            this.height = 0;
        } else {
            this.height=height;
        }
    }
    //this method used to get the value of height
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }

}
