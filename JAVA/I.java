import java.util.*;
import java.io.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem I (going) ACM MCPC 2016
 */


public class I {
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        while(T-->0) {
            int N = in.nextInt();
            int D = in.nextInt();
            
            Planet[] tab = new Planet[N];
            for(int i  = 0; i < N; i++) {
                tab[i] = new Planet(in.nextInt(), in.nextInt(), i);
                if(i == 0) continue;
                
                Planet tmp = tab[i];
                for(int j = 0; j < i; j++) {
                    Planet tmp2 = tab[j];
                    if(tmp.man(tmp2) <= D) {
                        tmp.d++;
                        tmp2.d++;
                    }
                }
            }
            
            Arrays.sort(tab);
            System.out.println(tab[N-1].idx+1);
            
        }
    
    }
}

class Planet implements Comparable<Planet> {
    int x, y, d, idx;
    public Planet(int x, int y, int id) {
        d= 0;
        this.x= x; 
        this.y= y;
        this.idx = id;
    }
    
    @Override
    public int compareTo(Planet p) {
        if(this.d == p.d) return p.idx -idx;
        return this.d - p.d;
    }
    
    public int man(Planet p) {
        return Math.abs(x - p.x) + Math.abs(y - p.y);
    }
    
}