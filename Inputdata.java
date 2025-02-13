import java.util.Scanner;
public class Inputdata{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String ch;
		int i=0;
			System.out.println("Enter a number :");
			i = sc.nextInt();
			System.out.printf("Value entered: %d\n", i);
			System.out.println("Enter a character :");
			ch = sc.next();
			System.out.printf("Character is :%s\n",ch);



}



}