package TestPrograms;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {12,4,5,2,5};
		int sum=0;
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Element at index no "+i+" is "+age[i]);
		}
		
		int arraylength = age.length;
		System.out.println("Array length:"+arraylength);
		for(int num=0;num<arraylength;num++) {
			sum=sum+age[num];
			System.out.println(sum);
		}
		System.out.println("Total sum : "+sum);
		double average = ((double)sum/(double)arraylength);
		System.out.println("Average Age :"+average);
	}
}


