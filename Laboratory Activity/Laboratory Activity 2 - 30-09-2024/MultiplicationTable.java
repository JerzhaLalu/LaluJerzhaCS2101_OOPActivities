import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the Multiplication Table: ");
        int size = input.nextInt();

        int[][] numbers = new int[size][size];

        GenerateTable(numbers, size);
        PrintTable(numbers, size);
 
        input.close();
    }

    public static void GenerateTable(int[][] numbers, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                numbers[i - 1][j - 1] = i * j;
            }
        }
    }

    public static void PrintTable(int[][] numbers, int size) {
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println();
        }
    }
}
