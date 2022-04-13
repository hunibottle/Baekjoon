package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15652 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        arr = new int[M];
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int index, int depth){
        if(depth == M){
            for (int var : arr) {
                sb.append(var).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = index ; i < N ; i++){
            arr[depth] = i+1;
            dfs(i, depth + 1);
        }
    }
}
