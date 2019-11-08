
package stringbuffermethods;
import java.io.*;

public class StringBufferMethods {

    public static void main(String[] args) throws IOException {
        // create empty string buffer object
        StringBuffer sb = new StringBuffer();
        
        //to accept data
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("enter surname");
       String sur =br.readLine();
       
       System.out.println("enter middle name");
       String mid= br.readLine();
       
       System.out.println("enter lastname");
       String last=br.readLine();
       
       sb.append(sur);
       sb.append(last);
       
       System.out.println("name=" + sb);
       
       //insert mid after surname in sb
       int n= sur.length();
       sb.insert(n,mid); // insert mid name after nth character
       
       System.out.println("full name=" + sb);
       System.out.println("in reverse=" + sb.reverse());
    }
}
