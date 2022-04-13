package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15650{

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
        bt(1,0);
        System.out.println(sb);
    }

    private static void bt(int index, int depth){
        if(depth == M){
            for (int var : arr) {
                sb.append(var).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = index ; i <= N ; i++){
            arr[depth] = i;
            bt(i+1, depth+1);
        }
    }
}