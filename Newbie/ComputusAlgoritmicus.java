import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true) {
            int A = Integer.parseInt(in.readLine());

            if(A == 0) break;

            int a = A%19,
                b = A%4,
                c = A%7,
                d = ((19*a) + 24)%30,
                e = ((2*b) + (4*c) + (6*d) + 5)%7,
                day;

            if(d+e < 10){
                day = (d+e+22);
                ans.append(day).append(" de marzo\n");
            } else {
                day = (d+e-9);
                if(day == 26) day = 19;
                if(day == 25 && d == 28) day = 18;
                ans.append(day).append(" de abril\n");
            }
        }
        out.print(ans);

        out.close();
    }
}
