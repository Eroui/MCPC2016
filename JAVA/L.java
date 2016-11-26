import java.util.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem L ACM MCPC 2016
 */


public class L {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        while(T-->0) {
            int n = in.nextInt();
            int count = 0;
            for(int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                count += tmp / 30;
                if(tmp % 30 != 0) count+= 1;
            }
            
            System.out.println(count);
        }
    }
}