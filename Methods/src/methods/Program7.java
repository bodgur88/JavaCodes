/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// Static methods do not act on instance variables.

/*
Static methods do not act on instance variables because the JVM first executes the static methods 
and then it creates the objects. Since the objects are not available at the time of calling the
staic methods, the instance variables are also not available.
*/

class Test
{
    // static var
    static int x = 55;
    
    // static method to access x value
    static void access()
    {
        System.out.println("[+] The satic variable is " + x);
    }
}


public class Program7 
{
public static void main(String args[])
        {
            Test.access();
        }
}
