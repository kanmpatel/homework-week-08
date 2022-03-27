import java.util.Scanner;

//check if it Armstrong number or not
public class Program10ArmstrongNumber {
    //this method is used to find number is Armstrong or not
    public static boolean armstrong(int number){
        int temp = number;
        int reminder, sum = 0;
        // while to find number is Armstrong or not using reminder and division
        while(number > 0){
            reminder = number % 10;
            number = number / 10;
            sum = sum + (reminder*reminder*reminder);
        }
        boolean result;
        //temp is equal to sum then number is armstrong
        if( temp == sum){
            result = true;
            System.out.println(temp + " is Armstrong number");

        } else {
            result = false;
            System.out.println(temp + " is not Armstrong number");
        }
     return result;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = Input.nextInt();
        System.out.println(armstrong(number));
    }
}
