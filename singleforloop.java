
public class singleforloop {
public static void main(String[] args) {
	
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int j = 100; j >= 0; j--) {
		System.out.println(j);
	}
	for (int k = 2; k < 101; k++) {
		if (k%2 == 0) {
			System.out.println(k);
		}
	}
	for (int q = 1; q <= 99; q++) {
		if (q%2 == 1) {
			System.out.println(q);
		}
	}
	for (int w = 0; w <= 500; w++) {
		if (w%2 == 0) {
			System.out.println(w + " is even");
		}else{
			System.out.println(w + " is odd");
		}
	}
	for (int e = 7; e <= 777; e++) {
		if (e%7 == 0) {
			System.out.println(e);
		}
	}
	for (int r = 2003; r <= 2018; r++) {
		System.out.println(r + " I was "+ (r-2003));
	}
}
}
