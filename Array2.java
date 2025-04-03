
public class Array2 {

	public static void main(String[] args) {
		
		String data = "apple. Hello Welcome, to 1234 Hyderabad";
		int[] count = new int[26];
		
		data = data.toUpperCase();
		
		for(int i=0;i<data.length();i++) {
			char ch = data.charAt(i);
			if( (ch>='A') &&(ch<='Z')) {
				count[ch-(int)'A']++;//"A"-	
			}
				
			
			}
		
		for(int i=0,k=65;i<26;i++,k++) {
			System.out.println((char)k+"---->"+count[i]);
		}
		
		
		
		
	}

}
