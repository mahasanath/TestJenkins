import java.io.IOException;


public class RemoveChar {
	public static void symbolremoval(String str) {
		int i;
		String new_String="";
		for(i=0;i<str.length();i++) {
			int ascii_val = (int) str.charAt(i);
			
			
			if (((ascii_val >= 65) && (ascii_val <= 90)) || ((ascii_val >= 97) && (ascii_val <= 122)) || ((ascii_val >= 48) && (ascii_val <= 57)) || (ascii_val == 32)) {
				
				new_String = new_String+ str.charAt(i);
			}
  			
		}
		System.out.println(new_String);
	}
	
	public static void symbolremovalSelected(String Str) {
		String delims = "[ ,!,@,',.,?,*,:,(,)]+";
		String new_String="";
		int i;
		String[] tokens = Str.split(delims);
		for (i=0;i<tokens.length;i++) {
			//System.out.println(tokens[i] + " " + new_String);
			new_String = new_String + tokens[i];
		}
		new_String.trim();
		System.out.println(new_String);
	}
	public static void main(String [] args) throws IOException {
		String a ="Hi! 11... how are you , Tell me the answer: By when can you tell me?My email is Maha@gmail.com ! (Rem: This is a *secret*)";
		symbolremovalSelected(a);
	  		}
}
