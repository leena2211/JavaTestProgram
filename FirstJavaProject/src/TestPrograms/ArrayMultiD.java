package TestPrograms;

public class ArrayMultiD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][4];
		int size = a.length;
		System.out.println(size);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
					System.out.print(" * ");
					}
			System.out.println();
		}

	}
}