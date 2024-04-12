package Programs;

public class Write_a_java_program_to_reverse_any_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123456;
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println(rev);

	}

}
