

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        String[]products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        
        int[][] sales = new int[3][3];
        
        //Collect sales information
        for (int row =0; row < products.length;row++){
            for (int col = 0; col <3; col++){
                System.out.print("Enter number of sales for month " + (col +1) + " for " + products[row] + " mattres: ");
                sales[row][col] = input.nextInt();
            }
            System.out.println();
        }
        
        //Product object
        Product product = new Product(sales);
        PrintProduct report = new PrintProduct();
        
        report.PrintReport(product);
        
        input.close();
        
    }
}
