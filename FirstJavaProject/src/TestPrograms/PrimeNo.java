package TestPrograms;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = reader.nextInt();
		int i;
		boolean flag =false;
		
		for(i=2;i<num;i++) {
			
			if((num%i)==0)
			{
				System.out.println("It is not Prime number");
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("It is Prime number");
		}
	}

}
