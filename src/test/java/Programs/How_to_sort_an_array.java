package Programs;

public class How_to_sort_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,7,3,8,2,9,5,4,99};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
