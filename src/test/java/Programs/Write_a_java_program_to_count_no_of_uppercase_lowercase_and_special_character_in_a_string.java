package Programs;

public class Write_a_java_program_to_count_no_of_uppercase_lowercase_and_special_character_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello@#$%^12324B";
		int upperLetterCount=0;
		int lowerLetterCount=0;
		int splCharCount=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' & c<='Z')
			{
				upperLetterCount=upperLetterCount+1;
			}
			else if(c>='a' & c<='z')
			{
				lowerLetterCount=lowerLetterCount+1;
			}
			else
			{
				splCharCount=splCharCount+1;
			}
		}
		System.out.println("No of Upper Case Character="+upperLetterCount);
		System.out.println("No of Lower Case Character="+lowerLetterCount);
		System.out.println("No of Special Case Character="+splCharCount);
	}

}
