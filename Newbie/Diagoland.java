import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens;
        StringBuilder ans = new StringBuilder();
        while(true){
            tokens = new StringTokenizer(in.readLine());
            int w = Integer.parseInt(tokens.nextToken()),
                h = Integer.parseInt(tokens.nextToken());

            if(w == 0 && h == 0) break;

            int sum = 0;
            for(int i = 0; i < h; i++){
                char[] row = in.readLine().toCharArray();
                boolean inside = false;
                for(int j = 0; j < row.length; j++){
                    if(row[j] != '.'){
                        inside = !inside;
                        if(inside) sum++;
                    }else{
                        if(inside) sum++;
                    }
                }
            }
            ans.append(sum).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
