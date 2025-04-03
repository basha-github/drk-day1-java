
public class Prime2 {

	public static void main(String[] args) {
	
		int n=37,count=0;
		// 13
		// 2 3 4 5 6 
		//7    11  
		// 13/2----6
		// 14589102----
		int i=2;
		for(;(i<n/2) && (n % i !=0);i++) {
			//if(n % i ==0) {
				//	break;
			//}
		}
		System.out.println("i---->"+i);
		if(i == n/2) System.out.println(n+" is  Prime");
		else System.out.println(n+ " is not Prime");
	}

}
