/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

// prime number series
import java.io.*;

class Primes
{
    // to test and return true if number is prime
    static boolean prime(long num)
    {
        // initially isPrime is true,it becomes false if num is not prime
        boolean isPrime = true;
        
        for(int i=2; i<=num-1; i++)
        {
            if(num % i ==0)
                isPrime = false;
        }
        return isPrime;
    }
    
    // accept the number of prime numbers you want to print into max
    // c is counter for numer of prime numbers generated
    static void generate(long max)
    {
        long c = 1, num = 2;
        while (c<=max)
        {
            if(prime(num))
            {
                System.out.println(num);
                c++;
            }
        num++;
        }
    }  
}

public class PrimeDemo 
{
    public static void main(String args[]) throws IOException
    {
        // accept the number of of primes needed
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("[+] Enter the number of prime numbers to be generated");
        int max = Integer.parseInt(br.readLine());
        // generate max number of primes
        Primes.generate(max);
    }
}
