/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// Program for a method withou parameters but with a return type


class Sample2
{
    // instance variables
    private double num1, num2;
    
    Sample2(double x, double y)
    {
        num1 = x;
        num2 = y;
    }
    
    // method to calculate sum
    // method does not accept any value but returns result
    
    double sum()
    {
        double res = num1 + num2;
        return res;
    } 
}



public class Program2 
{
    public static void main(String args[])
    {
        // create an object and pass values 10, 22.5 to the constructor
        Sample2 s = new Sample2(10,22.5);
        
        // call the method and store the result in x
        double x = s.sum();
        System.out.println("[+] The sum is " + x);
    }
    
}
