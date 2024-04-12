package Programs;

public class Write_a_program_to_print_each_words_first_letter_in_upper_case_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalstr="";
		String f="";
		String str="Hello i am in hyderabad";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			finalstr="";
			char c=arr[i].charAt(0);
			c=Character.toUpperCase(c);
			String s=arr[i].substring(1);
			finalstr=c+finalstr+s+" ";
			f=f+finalstr;
		}
		System.out.println(f);
	}

}
