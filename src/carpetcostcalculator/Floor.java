package carpetcostcalculator;
//class name Floor
public class Floor {
    //instance variable
    double width;
    double length;

    //this constructor is used to initialize the fields
    public Floor(double width,double length){
        if(width<0){
            this.width = 0;
        } else {
            this.width = width;
        }
        if(length<0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }



    //this method return the area
    public double getArea(){
        return width*length;
    }

}
