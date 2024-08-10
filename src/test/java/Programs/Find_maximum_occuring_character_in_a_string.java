package Programs;

public class Find_maximum_occuring_character_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bikash I am here in Hyderabad";
		//String str="Bikash I";
		int[] arr=new int[256];
        for(int i=0;i<str.length();i++)
        {
        	arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        
        int max=-1;
        char ch=' ';	
        for(int i=0;i<str.length();i++)
        {
        	if(max<arr[str.charAt(i)])
        	{
        		max=arr[str.charAt(i)];
        		ch=str.charAt(i);
        	}
        }
        
        System.out.println(ch);
        System.out.println(max);
	}

}
