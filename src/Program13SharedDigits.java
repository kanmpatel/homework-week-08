import java.util.Scanner;

public class Program13SharedDigits {
    //this number is used to check between two number is any share digit or not
    public static boolean hasSharedDigit(int firstNumber ,int secondNumber){
        int leftFirstnumber = firstNumber/10;       //find the first value of firstnumber
        int rightFirstnumber = firstNumber%10;      //find the last value of firstnumber
        int leftSecoundnumber = secondNumber/10;    //find the first value of secoundnumber
        int rightSecoundnumber = secondNumber%10;   //find the last value of secoundnumber

        boolean result = true;
        //this check number is between 10 - 99 or not
        if (firstNumber < 10 || firstNumber >99 || secondNumber < 10 || secondNumber >99) {
             result = false;
        } else {
            if(leftFirstnumber == leftSecoundnumber || leftFirstnumber == rightFirstnumber || rightFirstnumber == rightSecoundnumber || rightFirstnumber == leftSecoundnumber){
                result = true;
            }
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number1 = Input.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = Input.nextInt();
        System.out.println(hasSharedDigit(number1,number2));
    }
}
