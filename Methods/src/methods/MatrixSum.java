/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
//Passing arrays to methods and returning them

import java.io.*;
import java.util.*;


class Matrix
{
    // take a 2D array for matrix and row,cols
    int arr[][];
    int r,c;
    
    // initialize and allot memory for array
    Matrix(int r, int c)
    {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }
    
    //accept 2D array from keyboard and return it
    
    int[][] getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        // StringTokenizer is used to accept each row as a single string and then
        // divide it into tokens. Each token represents an array element
        StringTokenizer st;
        
        for(int i=0; i<r; i++)
        {
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<c;j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        return arr;      
    }
    
    // accept two 2D arrays and find sum matrix and return it
    
    int[][] findSum(int a[][], int b [][])
    {
        int temp[][] = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                temp[i][j]= a[i][j] + b[i][j];
        return temp;
    }
    
    // display the resultant 2D array as a matrix
    void displayMatrix(int res[][])
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(res[i][j]+ "\t");
            }
        System.out.println();
        }
    }
}


public class MatrixSum 
{
    public static void main(String args[]) throws IOException
    {
        //  create 2 objects to matrix class, since each object contains an array
        
        Matrix obj1 = new Matrix(3,3); //3x3 Matrix
        Matrix obj2 = new Matrix(3,3);
        
        // take 3 reference for 2D arrays
        int x[][], y[][],z[][];
        
        System.out.println("\nEnter elements for the first matrix: ");
        x=obj1.getMatrix();
        
        System.out.println("\nEnter elements for second matrix: ");
        y=obj2.getMatrix();
        
        //add the matrices and return sum matrix into z
        z = obj1.findSum(x,y);
        
        System.out.println("\nThe sum of the matrix is: ");
        obj2.displayMatrix(z);
    }
}
