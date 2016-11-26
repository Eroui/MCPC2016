import java.util.*;


/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem D ACM MCPC 2016
 */


public class F {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        while(T-->0) {
            long a = in.nextLong();
            long b = in.nextLong();
            
            String s = in.next();
            
            if(s.equals("<")) {
                if(a < b) System.out.println("Yes");
                else System.out.println("No");
            }else {
                if(a > b) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}