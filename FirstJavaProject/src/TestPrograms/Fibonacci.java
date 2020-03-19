package TestPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0+1+12358
		int num =10;
		System.out.println("First 10 Fibonacci Series :");
		int sum=0;
		System.out.println(+sum);
		int temp=1;
		
		for(int i=0;i<num;i++) {
			int temp1=sum;
			sum=temp+sum;
			temp=temp1;
			System.out.println(+sum);
		}
	}

}
