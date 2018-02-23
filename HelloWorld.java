/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author joshuaoiseomaoje
 */
public class HelloWorld {

    public static void main(String[] args) {
        
        System.out.println("Hello Josh");
        
        // Variables
        int myFirstNumber = (10 + 5 ) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int FinalTotal = 1000 - myTotal;
        
        System.out.println(FinalTotal);
        
         // Data types
         
        int myIntValue = 5 / 2;
       //casting (float)
       float myFloatValue = (float) 5f /3f ;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue =" + myIntValue);
       System.out.println("myFloatValue =" + myFloatValue);
       System.out.println("myDoubleValue =" + myDoubleValue);
       
       // converting from pounds to kilogram
       double pounds = 200d;
       double ConvertedKilogram = pounds * 0.45359237d;
        System.out.println("Kilograms = " + ConvertedKilogram);
        
       // Char 
       // unicode-table.com. to get unicode 
       char myChar = '\u00A9';
       char my2ndChar = '\u00AE';
        System.out.println("unicode output was: " + myChar + my2ndChar);
        
        // Boolean
        boolean myBoolean = false;
    }
    
}
