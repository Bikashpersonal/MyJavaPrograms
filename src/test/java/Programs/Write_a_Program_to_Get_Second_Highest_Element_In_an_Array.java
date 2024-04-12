package Programs;

public class Write_a_Program_to_Get_Second_Highest_Element_In_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,9,5,7,3,9,12,56};
		int highest=0;
		int secondHighest=0;
		for(int n:arr)
		{
			if(highest<n)
			{
				secondHighest=highest;
				highest=n;
			}
			else if(secondHighest<n)
			{
				secondHighest=n;
			}
		}
         System.out.println(highest);
         System.out.println(secondHighest);
	}

}
