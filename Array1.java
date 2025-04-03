
public class Array1 {

	public static void main(String[] args) {
	
	
	long num = 1231267923123l;
	int r;
	int[] count = new int[10];
	
	while(num != 0) {
		r = (int)(num % 10);
		num = num / 10;
		  count[r]++;
		
		
	}
	
	
	
	}

}
