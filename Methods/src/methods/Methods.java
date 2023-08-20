/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// Program for a method without parameters and without a return type

class Sample
{
    // instance variables
    private double num1, num2;
    
    //parameterized constructor
    Sample(double x, double y)
    {
        num1 = x;
        num2 = y;
    }
    
    // method to calculate sum of num1, num2.
    // This method does not accept any value
    // and does not return any value either.
    
    void sum()
    {
        double res = num1 + num2;
        System.out.println("[+] The result is " + res);
    }
}


public class Methods {
    public static void main(String[] args) 
    {
    // create the objects and pass values to 10 and 22.5 to constructor
       Sample s = new Sample(20, 22.5);
       
    // call the method and find the sum
        s.sum(); 
    }   
}
