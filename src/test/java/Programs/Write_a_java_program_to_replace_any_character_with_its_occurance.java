package Programs;

public class Write_a_java_program_to_replace_any_character_with_its_occurance {

	public static void main(String[] args) {
		String str="Opentext";
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
			{
				str=str.replaceFirst(str.valueOf('t'), str.valueOf(count));
				count=count+1;
			}
		}
				
System.out.println(str);
	}

}
