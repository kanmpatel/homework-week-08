import java.util.Scanner;

/*Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*
* */
public class Program06DisplayTriangleWithNumber {
    //this method for print triangle of given number
    public static void triangle(int raw){
        //nested for loop1 to print triangle
        for(int i = 1; i<=raw;i++){
            for(int j = 1 ;j<=i;j++){  //nested for loop2 to print triangle
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the number of Raws : ");
        int rawvalue = Input.nextInt();
        //call static method triangle
        triangle(rawvalue);
    }
}
