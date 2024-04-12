package Programs;

public class How_to_extract_last_4_characters_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am in Hyderabad and I would like to stay in Hyderabad";
		String[] arr=str.split(" ");
		String[] arr1=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			String x=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				String y=arr[j];
				
				
				//if(arr[i].equalsIgnoreCase(arr[j]))
				if(arr[i].equalsIgnoreCase("Hyderabad"))
				{
					
					count=count+1;					
				}
				//arr1[i]=arr[i];
			}
			System.out.println(arr[i]+" is repeated "+count+" no of times.");
		}
		
	}

}
