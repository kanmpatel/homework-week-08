import java.util.Scanner;

//check number is prime number or not
public class Program12PrimeNumber {
    //this method is used to number is prime number or not
    public static void primenumber(int number){
        boolean isPrime = true;

        //check for loop for number is prime or not
        //it start with 2 because prime number divided by 1 also

        for(int i = 2;i<number;i++){
            if(number % 2 == 0){
                isPrime = false;
                break;
            }
        }
        //isprime true number is prime number
        if(isPrime){
            System.out.println(number + " is Prime number");
        } else {
            System.out.println(number + " is not Prime number");
        }

    }

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = Input.nextInt();
        //call prime method
        primenumber(number);

    }
}
