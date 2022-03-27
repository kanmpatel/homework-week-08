package carpetcostcalculator;
//class name Calculator
public class Calculator{
    Floor floor;
    Carpet carpet;


    //this constructor is used to initialize the fields
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //this method is used to calculate total cost
    public double getTotalCost(){
        double area = floor.getArea();
        double cost = carpet.getCost();
        return  area * cost;
    }
}
