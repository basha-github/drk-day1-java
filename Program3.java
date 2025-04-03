
public class Program3 {

	public static void main(String[] args) {
	
		//Write a program to count total number of notes in given amount
		// 735
		// 1000
		// 265
		// 100 --- 2
		// 50---1
		// 5 ---3
		
		int bill = 735;
		int cash = 1000;
		int n100=0,n50=0,n20=0,n10=0,n5=0,c2=0,c1=0;
		boolean note100=false,note50=true,note20=true,note10=true,
				note5=true,coin2=true,coin1=true;
		
		int change = cash - bill;// 265
		
		if((note100 == true) &&(change > 100)) {
			n100 =  265 / 100;
			change = change % 100;// 265/ % 100--- 65
		}
		if((note50 == true) &&(change > 50)) {
				n50 =  change / 50;// 65/ 50---- 1
			change = change % 50;// 65/ % 50--- 15
		}
		if((note20 == true) &&(change > 20)) {
				n20 =  change / 20;// 65/ 50---- 1
			change = change % 20;// 65/ % 50--- 15
		}
		if((note10 == true) &&(change > 10)) {
				n10 =  change / 10;// 65/ 50---- 1
			change = change % 10;// 65/ % 50--- 15
		}
		if((note5 == true) &&(change > 5)) {
			n5 =  change / 5;// 65/ 50---- 1
			change = change % 5;// 65/ % 50--- 15
		}
		if((coin2 == true) &&(change > 2)) {
			c2 =  change / 2;// 65/ 50---- 1
			change = change % 2;// 65/ % 50--- 15
		}
		if(coin1 == true) {
			c1 = 1;// 65/ 50---- 1
			
		}
		
		
		if(n100 > 0)
		System.out.println("100---->"+n100);
		if(n50 > 0)
		System.out.println("50---->"+n50);
		if(n20 > 0)
		System.out.println("20---->"+n20);
		if(n10 > 0)
		System.out.println("10---->"+n10);
		if(n5 > 0)
		System.out.println("5---->"+n5);
		if(c2 > 0)
		System.out.println("2---->"+c2);
		if(c1 > 0)
		System.out.println("1---->"+c1);
		
	}

}
