import java.util.Scanner;

public class Divisible {
	
	static int num;
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		s1();
	}
	static void s1()
	{
		if((num % 3==0)&&(num % 5==0))
		 {
		 System.out.println("Number is divisible by 3");
		 }
	    {
		System.out.println("Number is divisible by 5");	
		}
  }
	
}


