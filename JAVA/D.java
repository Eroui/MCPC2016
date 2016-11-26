import java.util.*;
import java.io.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Solution for Problem D ACM MCPC 2016
 */


public class D{

    public static void main (String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        while(T-->0) {
            int index, max;
            index = -1;
            max = -1;
            
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = in.nextInt();
                if(max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            
            boolean l = true, r = true;
            int idxl, idxr;
            idxl = idxr = index;
            idxr++;
            idxl--;

            if(idxr == N) idxr = 0;
            if(idxl == -1) idxl = N-1;
            
            while(idxl != index && idxr != index) {
                if(l == false && r == false) break;
                if(l) {
                    
                    if(arr[idxl] > arr[idxl == (N-1) ? 0: idxl + 1]) l = false;
                    idxl--;
                    if(idxl < 0) idxl = N-1;
                }

                if(r) {
                    if(arr[idxr] > arr[idxr == 0? N-1: idxr - 1]) r = false;
                    idxr++;

                    if(idxr == N) idxr = 0;
                }
            }
            
            String ans = "";
            if(l == false && r == false) ans = "NO";
            else {
                if(l == true) {
                    ans = ""+ (index+1) +" L";
                }else {
                    ans = ""+ (index+1) +" R";
                }
            }
            
            System.out.println(ans);
            
        }
    }
}