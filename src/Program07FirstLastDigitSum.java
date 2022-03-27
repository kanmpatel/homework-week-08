import java.util.Scanner;

public class Program07FirstLastDigitSum {
    //this method is used to  FirstLastDigitSum
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;    //number is less than 0 return -1
        }
        int lastDigit = number % 10;  //find the last digit of number
        int temp = number;
        int reminder, reverse = 0;
        int firstDigit;
        while (number > 0) {                      //reverse the original number
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        firstDigit = reverse % 10;         //find lastdigit of reverse number
        return lastDigit + firstDigit;     //calculate the last and first digits

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Input.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
    }
}
