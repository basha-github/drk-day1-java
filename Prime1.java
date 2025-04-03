
public class Prime1 {

	public static void main(String[] args) {
	
		int n=13,r,count=0;
		
		for(int i=1;i<=n;i++) {
			r = n % i;
			if(r==0) count++;
		}
		if(count==2) System.out.println("YES");
		else System.out.println("No");
	}

}
