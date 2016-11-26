import java.util.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem B ACM MCPC 2016
 */


public class B {
    
    public static HashMap<Long, Long> m = new HashMap<>();
    public static long _MAX = 2*1000000001;
    
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        init();
        int T = in.nextInt();
        
        while(T-->0) {
            int N = in.nextInt();
            long[] tab = new long[N];
            long count = 0;
            
            for(int i = 0; i < N; i++) {
                tab[i] = in.nextInt();
                if( i == 0) continue;
                
                
                for(int j = 0; j < i; j++) {
                    if(m.get(tab[j] + tab[i]) != null) count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
    
    public static void init(){
        m.put(1L, 1L);
        
        long cur = 2;
        long last = 1;
        
        while(cur <= _MAX) {
            m.put(cur, cur);
            cur += last;
            last = cur - last;
        }
        
    }
}