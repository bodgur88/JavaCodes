/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// This is a program that uses the "this" keyword

// this refers to all members of present class
class Sample8
{
    //x is an instance variable
    private int x;
    // default constructor
    Sample8()
    {
        this(55); // calls para constructor and sends 55 to it
        this.access(); // calls class method
    }
       // parameterized constructor
    Sample8(int x)
    {
       this.x = x; 
    }
    //method
    
    void access()
    {
        System.out.println("[+] The value of x is " +x);
    }
    
}

public class ThisDemo 
{
    public static void main(String args[])
    {
        Sample8 s = new Sample8();
    }
}
