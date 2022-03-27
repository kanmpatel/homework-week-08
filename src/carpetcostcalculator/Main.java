package carpetcostcalculator;

public class Main {
    public static void main(String[] args) {
        //object reference of carpet to set the value of cost
        Carpet carpet = new Carpet(3.5);
        //object reference of floor to set the value of width and length
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor,carpet);  //pass the object in parameter
        System.out.println("total= " + calculator.getTotalCost()); //get the total cost
        //object reference of carpet to set the value of cost
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        //object reference of floor to set the value of width and length
        calculator = new Calculator(floor,carpet);                 //pass the object in parameter
        System.out.println("total= " + calculator.getTotalCost()); //get the total cost
    }
}
