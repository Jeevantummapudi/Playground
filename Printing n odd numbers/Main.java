import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      //int flag=1;
      for(int count=1;count<=n;count=count+1)
      {
       /* if(count<n)
        {
        flag=flag+2;
        System.out.println(count);*/
        System.out.println(2 *count-1);
      }
	}
}