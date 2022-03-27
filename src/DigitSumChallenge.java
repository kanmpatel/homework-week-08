import java.util.Scanner;
//find the sum of given digits
public class DigitSumChallenge {
    //this method is used to calculate sum of digits
    public static int sumDigits(int number){
        int reminder,anwser = 0;
        if(number >= 10){    //count the sum of digits
           while(number > 0){
               reminder = number % 10;
               anwser = anwser + reminder;
               number = number/10;
           }
        } else if(number<=0 || number>=0 && number<=9) {  //return -1 if number > 0
            anwser = -1;
        }
    return anwser;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Input.nextInt();
        System.out.println(sumDigits(number));  //calling sumdigits method

    }
}
