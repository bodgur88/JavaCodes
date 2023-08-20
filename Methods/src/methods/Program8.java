/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

//Program to increment the value of instance variable via an object

class Test2
{
    // instance var
    int x =10;
    
    // method to display the variable
    void display()
    {
        System.out.println(x);
    }
    
}

public class Program8 
{
    public static void main(String args[])
    {
        // create 2 reference objects
        Test2 obj1, obj2;
        
        // create 2 objects
        obj1 = new Test2();
        obj2 = new Test2();
        
        // increment x in obj1
        
        ++obj1.x;
        
        System.out.print("[+] x in obj1 is ");
        obj1.display();
        
        System.out.print("[+] x in obj2 is ");
        obj2.display();
    }
    
}
