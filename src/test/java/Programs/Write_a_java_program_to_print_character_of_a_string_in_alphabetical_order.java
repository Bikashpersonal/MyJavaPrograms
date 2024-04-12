package Programs;

public class Write_a_java_program_to_print_character_of_a_string_in_alphabetical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		char temp;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
			
		}
            System.out.println(new String(ch));
	}

}
