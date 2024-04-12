package Programs;

public class Write_a_Program_For_Simple_Java_Array_Program_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i>0;i--)
		{
			for(int j=1;j<=10;j++)
			{
				if(i+j==11)
				{
					int k=i*j;
					System.out.println(i+"*"+j+"="+k);
				}
			}
		}
         
	}

}
