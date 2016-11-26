import java.util.*;
import java.io.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem G (going) ACM MCPC 2016
 */

public class G {
	public static int[] h;
	public static int a, n;

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while(T-->0) {
			n = in.nextInt();
			a = in.nextInt();

			h = new int[n];
			for(int i = 0; i < n; i++) 
				h[i] = in.nextInt();

			double hi = (h[n-1]+h[0])/2;
			double low = 0;
			double mid = 0;
			while(Math.abs(hi-low) >= 0.001) {
				mid = (low+hi)/2;

				if(check(mid)) {
					hi = mid;
				}else {
					low = mid;
				}

			}

			mid = (low+hi)/2;
			System.out.printf("%.3f\n", mid);

		}
	}


	public static boolean check(double r) {
		double low = h[0];
		int idx= 0;
		for(int i = 0; i < a; i++) {
			low += 2*r;
			while(idx < n && h[idx] < low){
				idx++;
			}

			if(idx == n){
				if(i <= a-1) idx = n;
				break;
			}

			low = h[idx];
		}

		if(idx < n) return false;
		else return true;
	}
}