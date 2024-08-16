import java.util.*;
class IT24100733Lab4Q2{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please Enter Exam Marks (out of 100) :  ");
		int examMarks=input.nextInt();
		
		if(examMarks>=0 && examMarks<=100){
			
			System.out.print("Please Enter Lab Submission Marks (out of 100) :  ");
			int labMarks=input.nextInt();
			
			if(labMarks>=0 && labMarks<=100){
				
				System.out.print("Please enter the percentage given for the exam :  ");
				int examPercentage=input.nextInt();
				
				System.out.print("Please enter the percentage given for the Lab submission :  ");
				int labPercentage=input.nextInt();

				double finalMarks=(examMarks*examPercentage/100) + (labMarks*labPercentage/100);

				if(finalMarks>=0 && finalMarks<=100){
					System.out.println("\nFinal Marks Is   : "+finalMarks);
				}else{
					System.out.println("\nThe percentages must add up to 100. Terminating Programme...");
		 		}
			
			}else{
				System.out.println("\nInvalid input for lab Marks. Terminating Programme... ");
			 }	
		}else{
			System.out.println("\nInvalid input for exam Marks. Terminating Programme... ");
		 }
	
	}
}