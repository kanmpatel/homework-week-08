import java.util.Scanner;

//print 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Program09FibonacciSeries {
    //this method is use for Fibonacci series
    public static void fibonacci(){
        Scanner Input = new Scanner(System.in);
        System.out.print("enter the number how long to print Fibonacci series : ");
        int number = Input.nextInt();
        int a = 1,b = 1;
        int c;
        System.out.print(a+ " "+ b); //print first two value 1 and 1
        //loop starts from 2 because 1 and 1 are already printed
        for(int i = 2;i<=number;i++){
            c = a + b;                //add value from pervious two value
            System.out.print(" " + c );
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        //call method fibonacci
        fibonacci();
    }
}
