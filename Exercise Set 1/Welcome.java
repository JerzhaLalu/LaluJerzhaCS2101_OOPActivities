import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
        System.out.println("Welcome to CS 211: Object-Oriented Programming!"); 

        Scanner ID = new Scanner(System.in);  
        System.out.println("Enter your name:");
        String Name = ID.nextLine();
          
        System.out.println("This course will be fun, " + Name + "!");
        ID.close(); 
    }
  }