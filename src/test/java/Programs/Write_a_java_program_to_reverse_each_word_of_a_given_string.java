package Programs;

public class Write_a_java_program_to_reverse_each_word_of_a_given_string {
	public static String fString="";
	public static String reverseString(String str)
	{
		fString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			fString=fString+str.charAt(i);
		}
		return fString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalOutPut="";
		String Str="Hello I am Here in Hyderabad";
		String[] arr=Str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			
			 String x=arr[i];
			 String y=reverseString(arr[i]);
			finalOutPut=finalOutPut+y+" ";
		}
		
        System.out.println(finalOutPut);


	}
	

}
