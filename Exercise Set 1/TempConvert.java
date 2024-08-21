import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner tempt = new Scanner(System.in);  
        
        System.out.println("Enter a Celsius value:");
        double celsius = tempt.nextDouble();  
        
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        
        tempt.close(); 
    }
}
