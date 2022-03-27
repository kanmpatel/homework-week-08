import java.util.Scanner;
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;  //store the MIN_VALUE of integer in maximum number of camparion
        int minimum = Integer.MAX_VALUE; //store the MAX_VALUE of integer in maximum number of camparion
        int i = 0;
        while(i<=0){
            int next1 = scan.nextInt();
            if(next1<0){
                break;
            } else {
                maximum = Math.max(next1,maximum);  // find the maximum number between two value
                minimum = Math.min(next1, minimum); // find the minmum number between two value
            }

        }
        System.out.println("Found maximum :"+maximum+", minimum:"+minimum);
        scan.close();
    }


}
