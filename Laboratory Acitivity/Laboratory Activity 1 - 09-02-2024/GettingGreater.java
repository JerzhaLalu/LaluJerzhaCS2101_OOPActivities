import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char ch1 = input.next().charAt(0); 
        int asciiValue1 = (int) ch1; 
        
        System.out.print("Enter second character: ");
        char ch2 = input.next().charAt(0); 
        int asciiValue2 = (int) ch2; 

        int higher = Math.max(asciiValue1, asciiValue2);
        char HigherCh = (char) higher;

        System.out.println("----------------------------------------------");
        System.out.println("The character with greater value is: " + HigherCh);
        System.out.println("----------------------------------------------");

        System.out.println("Showing the ASCII Codes");
    
        System.out.println(ch1 + " : " + asciiValue1);
        System.out.println(ch2 + " : " + asciiValue2);

    
        
        input.close();
    }
}