package Week1.day01;

public class ReadString {

	public static void main(String[] args) {
		
		String str = "123$#ABCDEF";
		
		for (int i=0; i<= str.length()-1;i++ ) {
		
			char ch = str.charAt(i);
			//System.out.println("character: "+ch);
			if (ch == 'D' || ch == 'F'){
				
				//char a = ch;
				System.out.println("print character: "+ch);
			}

		}
	}

}
