import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.lang.Math;
public class Solution {
    

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
double totalCost;
double tip,tax;
tip= meal_cost * tip_percent/100.0;
tax= meal_cost * tax_percent/100.0;
        totalCost= meal_cost + tip + tax;
                System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();

        int tip_percent = scanner.nextInt();
        
        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

