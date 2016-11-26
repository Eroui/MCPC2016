import java.util.*;
import java.io.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem G (going) ACM MCPC 2016
 */

public class scorify {
    
    public static void main (String[] args) {
        IO io = new IO(System.in);
        int T = io.nextInt();
        
        while(T-->0) {
            HashMap<String , String> m = new HashMap<>();
            int n = io.nextInt();
            n <<= 1;
            for(int i= 1; i < n; i++) {
                String name = io.next();
                if(m.get(name) != null) m.remove(name);
                else m.put(name, name);
            }
            
            Set<String> ks = m.keySet();
            for(String s: ks) {
                io.println(s);
            }
            
        }
        
        
        
        io.flush();
		io.close();
    }
}

class IO extends PrintWriter {
    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;
		
	public IO(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
    
    public IO(InputStream i, OutputStream o) {
		super(new BufferedOutputStream(o));
		r = new BufferedReader(new InputStreamReader(i));
	}
	
	
    public boolean hasNext() {
        return peekToken() != null;
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() { 
	    return Double.parseDouble(nextToken());
    }

    public long nextLong() {
	    return Long.parseLong(nextToken());
    }

    public String next() {
	    return nextToken();
	}
	    
    public String nextLine() {
	    token = null;
	    st = null;
	    try {
	    	return r.readLine();
	    } catch (IOException e) {
	    	return null;
	    }
    }

    private String peekToken() {
	    if (token == null) 
		    try {
			    while (st == null || !st.hasMoreTokens()) {
			        line = r.readLine();
			        if (line == null) return null;
			        st = new StringTokenizer(line);
			    }
			    token = st.nextToken();
	        } catch (IOException e) { }
		return token;
        
    }

	   
    private String nextToken() {
		String ans = peekToken();
		token = null;
		return ans;
	}
}