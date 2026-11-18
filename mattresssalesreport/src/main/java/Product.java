/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product implements IProducts{
    
    //Single-dimensional array
    private String[] productsNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };
    
    //Two -dimensional array
    private int[][] sales = new int[3][3];
    
    public Product(int[][] sales){
        this.sales = sales;
    }
    
    @Override 
    public int GetTotalProductsSold() {
        int total = 0;
        
        for (int row = 0; row < sales.length; row++){
            for (int col = 0; col < sales[row].length; col++){
                total += sales[row][col];
            }
        }
        return total;
    }
    
    //Calculate average
    @Override
    public double GetAverageProducts(){
        
        int total = GetTotalProductsSold();
        int numberOfSales = sales.length * sales[0].length;
        
        return (double) total/numberOfSales;
        
    }
    
    @Override
    public String GetMostPopularProduct(){
        
        int highestSales = 0;
        int popularIndex = 0;
        
        for (int row =0;row < sales.length;row++){
            int productTotal = 0;
            
            for (int col =0; col < sales[row].length; col++){
                productTotal = sales[row][col];
            }
            
            if (productTotal > highestSales){
                highestSales = productTotal;
                popularIndex = row;
            }
        }
        return productsNames[popularIndex] + "(" +highestSales +")";
        
    }
    
    //Get product Name
    public String GetProductName(int index){
        return productsNames[index];
    }
    
}
