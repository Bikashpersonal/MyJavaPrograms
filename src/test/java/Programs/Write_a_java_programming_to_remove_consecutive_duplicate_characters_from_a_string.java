package Programs;

public class Write_a_java_programming_to_remove_consecutive_duplicate_characters_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalstr="";
		String str="Programminggg";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				finalstr=finalstr+str.charAt(i);
			}
			else
			{				
				continue;
			}
		}
		System.out.println(finalstr+str.charAt(str.length()-1));
	}

}
