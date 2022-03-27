import java.util.Scanner;

/*Print Triangle
  @
  @@
  @@@
  @@@@
  @@@@@
* */
public class Program08DisplayTriangleWithChar {
    //this method for print triangle with given charchter
    public void angleTriangle(char ch){
        //nested for loop
        for(int i = 1;i<=5 ;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("enter any character for triangle :");
        char ch1 = Input.next().charAt(0);
        //Creating object
        Program08DisplayTriangleWithChar obj = new Program08DisplayTriangleWithChar();
        obj.angleTriangle(ch1);



    }
}
