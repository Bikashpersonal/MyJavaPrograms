package Programs;

public class Java_program_to_find_first_nonrepeatattive_character_in_a_string {

	public static int count(String str,char ch)
	{
		int charCount=0;
		int index=str.indexOf(ch);
		while(!(str.indexOf(ch)<0))
		{
			charCount=charCount+1;
			str=str.substring(str.indexOf(ch)+1);
		}
		return charCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="automation";
		while(str.length()>0)
		{
			char ch=str.charAt(0);
			//System.out.println("The number of times "+ch+" is repeated="+count(str,ch));
			if(count(str,ch)==1)
			{
				System.out.println(ch);
				break;  
			}
			str=str.replaceAll(""+ch, "");
			
		}

	}

}
