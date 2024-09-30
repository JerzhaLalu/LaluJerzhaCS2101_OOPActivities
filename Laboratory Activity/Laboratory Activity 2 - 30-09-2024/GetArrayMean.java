import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        input.nextLine();

        int [] numbers = new int[size];
            
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }
        
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        } 

        int mean = sum/size;

        System.out.println("Mean of array is: " + mean);

            

        input.close();
    }

}
