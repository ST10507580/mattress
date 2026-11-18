/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    public void PrintTotalSales(int total){
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }
    public void PrintAverageSales(double average){
        System.out.printf("AVEARGE PRODUCT SALES: %.0f%n", average);
    }
    public void PrintPopularProduct(String product){
        System.out.println("MOST POPULAR PRODUCT: " + product);
    }
    public void PrintReport(Product product){
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*************************************************");
        
        PrintTotalSales(product.GetTotalProductsSold());
        
        PrintAverageSales(product.GetAverageProducts());
        
        PrintPopularProduct(product.GetMostPopularProduct());
    }
    
}
