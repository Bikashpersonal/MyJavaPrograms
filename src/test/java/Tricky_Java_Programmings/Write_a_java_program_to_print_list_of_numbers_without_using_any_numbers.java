package Tricky_Java_Programmings;

public class Write_a_java_program_to_print_list_of_numbers_without_using_any_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startNumber='A'/'A';
		String endNumber="..........";
		int endNumbers=endNumber.length()* endNumber.length();
		
		for(int i=startNumber;i<=endNumbers;i++)
		{
			System.out.println(i);
		}

	}

}
