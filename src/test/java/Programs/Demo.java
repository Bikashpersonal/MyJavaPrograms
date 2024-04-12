package Programs;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abncd-ed8bikash";  //dedcn-ba
		char[] ch=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(!Character.isLetter(ch[start]))
			{
				start=start+1;
			}
			else if(!Character.isLetter(ch[end]))
			{
				end=end-1;
			}
			else
			{
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start=start+1;
				end=end-1;
			}
		}
		
		System.out.println(new String(ch));
	}

}
