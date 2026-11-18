/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductTest {
    
    //Unit 1
    @Test
    public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue(){
        
        int[][]sales ={
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        Product product = new Product(sales);
        
        assertEquals(153, product.GetTotalProductsSold());
    }
    
    //UNIT 2
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
    
        int[][]sales ={
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
                
        };
        Product product = new Product(sales);
        
        assertEquals(17.0, product.GetAverageProducts());
    }
    
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
