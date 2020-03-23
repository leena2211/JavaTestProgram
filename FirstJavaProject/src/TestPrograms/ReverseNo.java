package TestPrograms;
import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		//1234
		System.out.println("Number entered:"+num);
		while(num!=0)
		{
			int temp1= num%10;
			System.out.print(+temp1);
			num=num/10;
		}
		
	}

}
