import java.util.Scanner;

/*Read 10 numbers from the console entered by the user and print the sum of those
numbers.*/
public class ReadingUserInputChallenge {
  //this method is used to get 10 number from user and get the sum of numbers
    public void method1(){
        Scanner Input = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count <= 10) {
            System.out.print("Enter number #" + count);
            //check entered number is int or not
            boolean validateNumber = Input.hasNextInt();
            //if int than sum of those value
            if(validateNumber) {
                int number = Input.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");   //else print invalid number
            }
            // Always return new userInput
            Input.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);  //print the value of sum

        Input.close();
    }


    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.method1();
        //obj.nextInt1();
    }
}
