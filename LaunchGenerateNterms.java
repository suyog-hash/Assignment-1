package Assignment1;
import java.util.Scanner;

public class LaunchGenerateNterms {
	
	
	

	 public static void main(String[] args) {
	  Scanner cs=new Scanner(System.in); 
	     int n,i=1;
	     System.out.println("Enter the range of number(Limit):");
	     n=cs.nextInt();
	     while(i<=n)
	     {
	      System.out.print(i*i*i+" ");
	      i++;
	      }
	      cs.close();
	 }
	}


