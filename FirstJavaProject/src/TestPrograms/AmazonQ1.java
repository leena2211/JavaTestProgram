package TestPrograms;
import java.util.Scanner;
public class AmazonQ1 {

	public static void main(String[] args) {
		
//Write a function in any language that will print "AN" if a number is divisible by 8, "ANIM" if divisible by 16 and "ANIMAL" if divisible by 32.  
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = reader.nextInt();
		printAn(num);
		
	}
	
	public static void printAn( int i) {
		
		if((i%32)==0) {
			System.out.println("Animal");
			System.out.println("Anim");
			System.out.println("An");
			}else if((i%16)==0){
				System.out.println("Anim");
				System.out.println("An");
				}else if((i%8)==0){
					System.out.println("An");
				}else {
					System.out.println(" Neither of Number are divisble by 8,16 and 32");
					
				}
	}

}
