
public class Program5 {

	public static void main(String[] args) {
		
		int num =7801,r,sum =0;
		int d=1;
		int t=num;
		while(num != 0) {
			num = num / 10;
			d = d*10;
		}
		d = d/10;
		num = t;
	// d--- 1000--- 100---10---1	
		while(d !=0) {
			r = num /d;
			num = num % d;
			d = d/10;
			sum = sum + r;
			System.out.print(r+" ");
		}
		System.out.println("\n sum ---->"+sum);
		
	}

}
