import java.util.Scanner;

public class Program05PalindromeNumber {
    //this method check number is palindrome or not
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = Math.abs(number);   //convert the negative value into positive valur
        }
        int reminder, sum = 0;
        int temp = number;
        //this loop reverse the number
        while (number > 0) {
            reminder = number % 10;
            sum = sum * 10 + reminder;
            number = number / 10;
        }
        //condition check reveser number and original number has same
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Input.nextInt();
        //check number is palindrome or not
        System.out.println(isPalindrome(number));
    }
}
