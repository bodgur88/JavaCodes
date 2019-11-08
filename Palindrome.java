package palindrome;
import java.io.*;

public class Palindrome 
{   
    public static void main(String[] args) throws IOException
    {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
 System.out.println("enter a string");
 String str= br.readLine();
 String temp= str;
 
 StringBuffer sb = new StringBuffer(str);
 sb.reverse();
 
 str=sb.toString();
 
 if(temp.equals(str))
     System.out.println("palindrome");
 else
     System.out.println("not a palindrome");
 
    }  
}
