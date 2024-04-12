package Programs;

public class WAP_to_find_kth_largest_element_from_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 9 8 7 5 3 2 1
		int k=4;
		int[] arr= {8,3,7,9,2,5,1,10};
		for(int i=0;i<arr.length-1;i++)
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
			if(i==k-1)
			{
				System.out.println(arr[i]);
				break;
			}
		}

	}

}
