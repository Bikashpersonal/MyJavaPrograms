package Programs;

public class How_to_Copy_Specific_Array_Values_into_String_In_Java_With_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','b','c','d','e','f','g','h','i','j','k'};
		String str=String.copyValueOf(ch);
		
		System.out.println(str);
		System.out.println(String.copyValueOf(ch,2,5));
		

	}

}
