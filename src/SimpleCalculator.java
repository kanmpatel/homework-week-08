public class SimpleCalculator {
    double firstNumber;
    double lastNumber;
    //this method used to get the value of firstnumber
    public double getFirstNumber() {
        return firstNumber;
    }
    //this method used to get the value of lastnumber
    public double getLastNumber() {
        return lastNumber;
    }
    //this method used to set the value of firstnumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    //this method used to set the value of lastnumber
    public void setLastNumber(double lastNumber) {
        this.lastNumber = lastNumber;
    }
    //this method used to addition of two number
    public double getAdditionResult(){
        return firstNumber + lastNumber;
    }
    //this method used to Subtraction of two number
    public double getSubtractionResult(){
        return firstNumber - lastNumber;
    }
    //this method used to Multiplication of two number
    public double getMultiplicationResult(){
        return firstNumber * lastNumber;
    }
    //this method used to Division of two number
    public double getDivisionResult(){
        if(lastNumber == 0){
            return 0;
        } else {
            return firstNumber * lastNumber;
        }

    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);  //set value of firstnumber
        calculator.setLastNumber(4);     //set value of firstnumber
        System.out.println("add= " + calculator.getAdditionResult());  //addition
        System.out.println("subtract= " + calculator.getSubtractionResult()); //Subtraction
        calculator.setFirstNumber(5.25);
        calculator.setLastNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());   //Multiplication
        System.out.println("divide= " + calculator.getDivisionResult());  //Division
    }




}
