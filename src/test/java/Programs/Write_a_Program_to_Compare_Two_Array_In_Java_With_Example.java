package Programs;

import java.util.Arrays;

public class Write_a_Program_to_Compare_Two_Array_In_Java_With_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[]={"Bikash","Mousumi","Ghentu","Ghata","Ghant"};
		String arr2[]={"Bikash","Mousumi","Ghentu","Ghata","Ghant"};
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Yes both arrays are same");
		}else
		{
			System.out.println("No both arrays are not same");
		}
	}
}
