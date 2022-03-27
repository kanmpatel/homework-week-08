import java.util.Scanner;

public class Program11EvenDigitSum {
    //this method used the sum of even digits of given number
    public static int getEvenDigitSum(int number){
        if(number<0){
            return  -1;     //number is less than 0 return -1
        }
        int lastDigit = 0;
        int evenDigitSum = 0;

        while(number > 0){
            lastDigit = number % 10;       //store the last digit of number
            if(lastDigit % 2 == 0){         //check each iteration number is mode 2 is 0 is even number
                evenDigitSum +=lastDigit;   //evennumber is added with evendigitsnum
            }
            number = number/10;
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Input.nextInt();
        System.out.println(getEvenDigitSum(number));
    }
}
