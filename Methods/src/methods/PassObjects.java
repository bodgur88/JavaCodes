/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// Interchanging values should be done in one object

class Employee
{
    // instance variables
    int id1, id2;
    
    // constructor to initialize id values
    Employee(int id1, int id2)
    {
        this.id1 = id1;
        this.id2 = id2;
    }  
}

class Check
{
    // method to interchange id values in same Employee object
    void swap (Employee obj)
    {
        int temp; //takes temporary variable
        temp = obj.id1;
        obj.id1 = obj.id2;
        obj.id2 = temp;
    }
}


public class PassObjects 
{
    public static void main(String args[])
            {
                // take employee class objects with id values
                Employee obj1 = new Employee(10,20);
                
                // create check class object
                Check obj = new Check();
                
                // display data before calling
                System.out.println("[+] The original values are: " + obj1.id1+ "\t" + obj1.id2);
                
                // call swap and pass Employee class object
                obj.swap(obj1);
                
                // display data after swapping
                 System.out.println("[+] The values after swapping are: " + obj1.id1+ "\t" + obj1.id2);  
            }   
}
