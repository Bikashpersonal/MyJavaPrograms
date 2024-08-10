package Tricky_Java_Programmings;

public class Demo {
	
	public static void main(String[] args) {
		
		String str="Bikash iiiiiii am here in Hyderabad";
		int[] fr=new int[256];
		for(int i=0;i<str.length();i++)
		{
			fr[str.charAt(i)]=fr[str.charAt(i)]+1;
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			//if(fr[str.charAt(i)]>max)
				if(max<fr[str.charAt(i)] && str.charAt(i)!=' ')
			{
				max=fr[str.charAt(i)];
				c=str.charAt(i);
			}
			
		}
		
			System.out.println(c);
		}

}
