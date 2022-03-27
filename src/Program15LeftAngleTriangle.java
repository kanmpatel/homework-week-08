import java.util.Scanner;

//Display left angle triangle of * using nested for loops
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
public class Program15LeftAngleTriangle {
    public static void leftAngleTriangle(){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = Input.nextInt();
        // 1st loop
        for(int i = 0; i < rows ; i++){
            // nested 2nd loop
            for(int j = 2 *(rows - i);j>=0;j--){
                System.out.print(" ");          // printing spaces
            }
            // nested 3rd loop
            for (int j = 0 ; j <= i ;j++){
                System.out.print("* ");   // printing stars
            }
            // end-line
            System.out.println();
        }


    }

    public static void main(String[] args) {
        leftAngleTriangle();
    }
}
