/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// Program for a static method that accepts data and returns the result


class Sample3
{
    // static method should be declared as static
    static double sum(double num1, double num2)
    {
        double res = num1 + num2;
        return res;
    }
}



public class StaticMethod 
{
    public static void main (String args[])
    {
        // call the static method using Classname.methodname().
        double x = Sample3.sum(10, 22.5);
        System.out.println("[+] The sum is " + x);
    }
}
