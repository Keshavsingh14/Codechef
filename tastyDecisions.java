/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	
	{
	    Scanner s = new Scanner(System.in);
	    int size = s.nextInt();
	    int X[] = new int[size];
	    int Y[] = new int[size];
	    for(int i =0; i<=size-1; i++){
	        X[i] = s.nextInt();
	        Y[i] = s.nextInt();
	    }
	   
	    for(int i =0; i<=size-1; i++){
	        if(X[i]*2 > Y[i]*5){
	            System.out.println("Chocolate");
	        }
	        else if(X[i]*2 < Y[i]*5){
	            System.out.println("Candy");
	        }
	        else{
	            System.out.println("Either");
	        }
	        
	    }
		// your code goes here
	}
}