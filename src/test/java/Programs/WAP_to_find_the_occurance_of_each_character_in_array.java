package Programs;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class WAP_to_find_the_occurance_of_each_character_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int temp=0;
				int[] arr= {1,3,8,3,1,88,89,1,99,21,100,500,200};
				int[] fr=new int[arr.length];
				for(int i=0;i<arr.length;i++)
				{
					int count=1;
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]==arr[j])
						{
							fr[j]=-1;
							count=count+1;
						}
						
					}
					if(fr[i]!=-1)
					{
						fr[i]=count;
					}
				}
		       for(int i=0;i<arr.length;i++)
		       {
		    	   if(fr[i]!=-1)
					{
						System.out.println(arr[i]+" is repeated "+fr[i]+" no of times.");
					}
		       }
		
	}

}
