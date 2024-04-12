package Programs;

public class Write_a_java_code_to_remove_all_the_special_character_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloBikash@#$%^&Iamhe34re";
		// str=str.replaceAll("[^a-zA-Z0-1]", "");
		 str=str.replaceAll("[^a-zA-Z]", "");
System.out.println(str);
	}

}
