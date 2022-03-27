package carpetcostcalculator;
// class name is carpet
public class Carpet{
    //instance variable
    double cost;

    //this constructor is used to initialize the fields
    public Carpet(double cost) {

        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }

    }

    //this method used to get the value of cost
    public double getCost(){
        return cost;
    }
}
