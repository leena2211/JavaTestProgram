package TestPrograms;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello new World...");

		int i=9;
		
		System.out.println(fizzbuzz(i));
	}
		
		
	
		public static String fizzbuzz(int i){
		//for (i = 1; i <= 100; i++) {
			if ((i %  3 == 0) && (i % 5 == 0)) {
				return ("FizzBuzz");
			} else if (i % 3 == 0) {
				return ("Fizz");
			} else if (i % 5 == 0) {
				return ("Buzz");
			} else {
				return(Integer.toString(i));
			}

		}

	
}
