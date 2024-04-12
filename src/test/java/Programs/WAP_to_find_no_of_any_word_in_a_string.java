package Programs;

public class WAP_to_find_no_of_any_word_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int count=0;    
		String str="Hello I am in Hyderabad andHyderabad I would love to stay in Hyderabad    Hyderabad";
		for(int i=0;i<=str.length()-9;i++)
		{
			String s=str.substring(i,i+9);
			System.out.println(s);
			if(str.substring(i,i+9).equals("Hyderabad"))
			{
				count=count+1;
			}
		}
		
		System.out.println(count);
	}

}
