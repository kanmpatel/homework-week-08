import java.util.Scanner;

// character is Vowel or Consonant
public class Program03VowelConsonant {
    public static void vowelConsonant(char ch){
        //check a e i o u or A E I O U is vowels
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Entered character "+ch+" is  Vowel");
        } else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {  // check consonents
            System.out.println("Entered character " + ch + " is Consonent");
        } else {
            System.out.println("Not an alphabet");
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input an alphabet: : ");
        char alpha = Input.next().charAt(0);  // get one char form the concole
        vowelConsonant(alpha);   //check alphbet is vowels or not
    }
}
