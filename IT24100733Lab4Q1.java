import java.util.*;
class IT24100733Lab4Q1{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an Integer Number :  ");
		int number=input.nextInt();
		if(number>0){
			System.out.println("The number is : Positive");
		}else if(number<0){
		 	System.out.println("The number is : Negative");
		 }else if(number==0){
		  	System.out.println("The number is : Zero");
		  }
		
	}


}