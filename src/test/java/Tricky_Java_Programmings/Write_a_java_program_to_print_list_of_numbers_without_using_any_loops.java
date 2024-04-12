package Tricky_Java_Programmings;

public class Write_a_java_program_to_print_list_of_numbers_without_using_any_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayNumbers(1,100);

	}
	
	public static void displayNumbers(int strNumber,int endNumber)
	{
		if(strNumber<=endNumber)
		{
			System.out.println(strNumber);
			strNumber=strNumber+1;
			displayNumbers(strNumber,endNumber);
		}
	}

}
