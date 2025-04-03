
public class Demo {

	public static void main(String abc[]) {

// if
		int a = 10, b = 20, c = 100, big,small;
		
		if(a>b) {
			big=a;
			small=b;
		}
		else {
			big=b;
			small=a;
		}
		if(c>big) big=c;
		if(c<small) small=c;
		
		System.out.println("biggest-->" + big);
		System.out.println("small-->" + small);

	}

}
