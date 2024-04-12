package Programs;

public class How_to_Delete_An_Element_From_An_Array_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90};
		int n=40;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
