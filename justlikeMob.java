import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try{
	Scanner sc = new Scanner(System.in);
	
	int test = sc.nextInt();
	
	while(test-->0){
	    
	    int no = sc.nextInt();
	    int mo = sc.nextInt();
	    int ko = sc.nextInt();
	    int yo = sc.nextInt();
	    
	    
	    if(yo %((no * ko)+mo)==0){
	        System.out.println("YES");
	    }
	    
	    else if(yo%((no*ko)+mo)-(no*(ko-1))>0){
	        System.out.println("YES");
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
