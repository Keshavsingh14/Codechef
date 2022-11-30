/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try{
	Scanner s
    c = new Scanner(System.in);
	int test = sc.nextInt();
	while(test-->0){
	    int num = sc.nextInt();
	    int[] kes = new int[num];
	    int Sum =0;
	    int count = 0;
	    for(int i=0;i<num;i++){
	        kes[i] = sc.nextInt();
	        if(kes[i]%2==0){
	            count++;
	        }
	        Sum = Sum+kes[i];
	    }
	    if(Sum%2==0){
	        if(count==num){
	            System.out.println("NO");
	        }
	        else{
	            System.out.println("YES");
	        }
	    }
	    else{
	        System.out.println("NO");
	    }
	    
	}
	}
	catch(Exception e){
	    System.out.println("exception");
	}
}
}
