import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>0&&n<6)
      {
        if(n==1)
          System.out.println("One");
        else if(n==2)
          System.out.println("Two");
               else if(n==3)
          System.out.println("Three");
               else if(n==4)
          System.out.println("Four");
               else
          System.out.println("Five");
      }
      else
        System.out.println("Invalid");
	}
}