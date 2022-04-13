package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p15649{
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static boolean[] visit;
    static int[] arr;

    //1부터 N개 까지의 자연수를 중복없이 M개의 수열로 표현
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth){
        if(depth == m){
            for (int var : arr) {
                sb.append(var).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0 ; i < n ; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}