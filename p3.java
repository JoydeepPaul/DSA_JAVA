 import java.util.Scanner;

public class p3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: "); // A good practice to prompt the user
    int a = sc.nextInt();

    // The outer loop controls the rows. We'll go from 1 to 'a'.
    for (int i = 1; i <= a; i++) {
      
      // Inner loop 1: Print the spaces
      // For row 'i', we need 'a - i' spaces.
      for (int j = 1; j <= a - i; j++) {
        System.out.print(" "); // Use print() to stay on the same line
      }

      // Inner loop 2: Print the stars
      // For row 'i', we need 'i' stars.
      for (int k = 1; k <= i; k++) {
        System.out.print("*"); // Use print() to stay on the same line
      }

      // After printing spaces and stars for the row, move to the next line.
      System.out.println();
    }
    sc.close(); // Good practice to close the scanner
  }
} 
  

