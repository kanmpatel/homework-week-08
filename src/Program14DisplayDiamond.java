import java.util.Scanner;

//display the pattern like a diamond.
//While loop
public class Program14DisplayDiamond {
    //this method print the pattern like diamond
    public void diamond(){
        //use 1 while loop
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = Input.nextInt();
        int space=rows-1;
        int i=1,j=1;
        while(j<=rows){//parent wile loop
            System.out.print("\n");//move to next line
            j=1;
            while(j<=space){//while loop for print space
                System.out.print(" ");//print space
                j++;
            }
            j=1;
            while(j<=2*i-1){//while loop for printing star
                System.out.print("*");//print star
                j++;
            }
            i++;
            space--;
        }
        i=rows-1;
        space=1;
        while(i>=1){//parent while loop
            System.out.print("\n");
            j=1;

            while(j<=space){
                System.out.print(" ");//print space
                j++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print("*");//print star
                j++;
            }
            i--;
            space++;
        }

    }

    public static void main(String[] args) {
        //create object for instance method
        Program14DisplayDiamond obj = new Program14DisplayDiamond();
        obj.diamond();
    }
}
