package Programs;

public class Java_program_to_remove_duplicate_characters_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fstr="";
		String str="bikash i am here in hyderabad";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(fstr.indexOf(ch)==-1)
			{
				fstr=fstr+ch;
			}
		}
		
		System.out.println(fstr);
	}

}
