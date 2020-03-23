package TestPrograms;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num= reader.nextInt();
		int originalNum = num;
		int temp1=0;
		//12321
		
		while(num!=0)
		{
		
		int reminder = num%10;
		temp1 = temp1 *10 + reminder;
		
		num=num/10;
	}
System.out.println("Reverse number :"+temp1);

if(originalNum == temp1) {
	System.out.println("It is Palindrome");
}else {
	System.out.println("It is not Palindrome");
}

  }
}
