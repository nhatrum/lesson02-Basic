package rum.dev;

import java.util.Scanner;

public class Basic {
	
	 public static void main(String[] args) {
		 int a, b;
		 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("a = ");
	        a = sc.nextInt();
          System.out.print("b = ");
          b = sc.nextInt();
      
      
      int tong = a + b;
      System.out.println(a + " + " + b + " = " + tong); 
      
      int hieu = a - b;
      System.out.println(a + " - " + b + " = " + hieu);  
      
      int tich = a * b ;
      System.out.println(a + " * " + b + " = " + tich);	
      
      int thuong = a / b ;
      System.out.println(a + " / " + b + " = " + thuong);	
      
      
      
  }
}