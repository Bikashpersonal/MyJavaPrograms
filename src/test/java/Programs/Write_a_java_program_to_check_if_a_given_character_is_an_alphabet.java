package Programs;

public class Write_a_java_program_to_check_if_a_given_character_is_an_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=3;
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println("The given character is an alphabet.");
		}
		else
		{
			System.out.println("The given character is not an alphabet.");
		}
	}

}
