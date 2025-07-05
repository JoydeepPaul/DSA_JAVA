import java.util.Scanner;

public class p7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size (n): ");
        int n = sc.nextInt();

        // --- Upper Half of the Butterfly ---
        for (int i = 1; i <= n; i++) {
            // 1. Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Print spaces
            // The formula is 2 * (n - i)
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after the row is printed
            System.out.println();
        }

        // --- Lower Half of the Butterfly ---
        // The logic is identical, we just run the loop for 'i' in reverse
        for (int i = n; i >= 1; i--) {
            // 1. Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Print spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
        
        sc.close();
    }
}