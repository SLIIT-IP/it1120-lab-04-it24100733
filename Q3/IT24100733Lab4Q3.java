import java.util.*;
class IT24100733Lab4Q3{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int number=input.nextInt();
		
		System.out.println((number>0) ? "\nThe Number is positive Number..." : (number<0) ? "\nThe Number is Negative Number..." : "\nThe Number is Zero...");
		
	}

}