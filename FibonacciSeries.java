package JAP82.NumberSystem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for(int i=1; i<=n; i++)
        {
            int sum = num1+ num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }

    }
}
