/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int num = arr[0];
		    for(int i =1; i<n;i++){
		        num = nm(num,arr[i]);
		    }
		    int cnt = 0;
		    for(int i =0; i<n; i++){
		        if(arr[i] == num){
		            cnt++;
		        }
		    }
		    System.out.println(n-cnt);
		}
	}
	public static int nm(int a, int b){
	    if(a==0){
	        return b;
	    }
	    return nm(b%a,a);
	}
}
