
public class Program4 {

	public static void main(String[] args) {
		
		int num =1234,r,sum =0;
		// 1+2+3+4
		
		while(num > 0) {
			r = num % 10;
			num = num /10;
			sum = sum + r;
		}
	
		System.out.println("total digitals---->"+sum);
		
	}

}
