/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// There are 2 types of instance methods
// Accessor methods
// Mutator methods - Access instance variables and modify them
 
class Person
{
    // instance variables
    private String name;
    private int age;
    
    //mutator methods to store data
    public void setName(String name)
    {
      this.name = name;  
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    // accesor methods to read data
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
}

public class InstanceMethods 
{
    public static void main(String args[])
    {
        // create an empty Person class object
        Person p1 = new Person();
        
        // store some data into object
        p1.setName("Raju");
        p1.setAge(23);
        
        //access data from objects
        System.out.println("[+] The name is " + p1.getName());
        System.out.println("[+] The age is "+ p1.getAge()); 
    }
    
}
