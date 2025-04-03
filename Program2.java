
public class Program2 {

	public static void main(String[] args) {

		
		//Write a program to count total number of notes in given amount
		
		// bill 735
		// amount 1000
		// 1000n- 735----265
		// A a 
		// ascii
		
		char[] ch = {'8','A','k'};
		
		
		for(int i=0;i<ch.length;i++) {
			if( (ch[i] >='A') &&(ch[i] <='Z')) {
				System.out.println(ch[i]+ " is UPPER Case");
			}
			else if( (ch[i] >='a') &&(ch[i] <='z')) {
				System.out.println(ch[i]+ " is Lower Case");
					
			}
			else if( (ch[i] >='0') &&(ch[i] <='9')) {
				System.out.println(ch[i]+ " is DIGITS ");
			}
		}
		// A B.....Z
		
		
	}

}
