package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1987 {
    static int r;
    static int c;

    static int[][] check;
    static boolean[] visited;

    static int[] dr = { -1, 1, 0, 0 };
    static int[] dc = { 0, 0, -1, 1 };
    static int depth = 0;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        check = new int[r][c];
        visited = new boolean[26];// 알파벳의 갯수

        for (int i = 0; i < r; i++) {
            String[] s = br.readLine().split(""); // 입력한줄을 한글자씩 나눠서 배열에 한글자씩 넣는다.
            for (int j = 0; j < c; j++) {
                String ss = s[j];
                check[i][j] = ss.charAt(0) - 'A'; // 아스키 코드 개념
            }
        }
        // check 배열은 알파벳에서 다음과 같이 저장된다.
        // 2 0 0 1
        // 0 3 2 1
        // 알파벳을 다음과 같이 저장한 이유는 동일한 알파벳은 동일한 visited 배열의 인덱스 값을 가지기 때문에 방문여부 파악을 용이하게
        // 하기 위해서 이다.

        dfs(0, 0, depth);
        System.out.println(answer);
    }

    public static void dfs(int a, int b, int depth) {
        if (visited[check[a][b]]) {
            answer = Math.max(answer, depth);
        } else {

            System.out.println(a + " " + b);
            visited[check[a][b]] = true; // 해당 알파벳 방문 처리

            for (int i = 0; i < 4; i++) { // 상하좌우 탐색
                int nr = a + dr[i];
                int nc = b + dc[i];
                if (nr >= 0 && nc >= 0 && nr < r && nc < c) {
                    dfs(nr, nc, depth + 1); // depth 1증가 시키면서 dfs 호출
                }
            }
            visited[check[a][b]] = false; // 방문 기록 초기화

        }

    }

    // }
}
