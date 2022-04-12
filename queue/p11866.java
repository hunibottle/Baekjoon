package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p11866 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < N ; i++){
            queue.add(i+1);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size() > 1){
            for(int i = 0 ; i < K -1 ; i++){
                queue.offer(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);

        // while(true){
        //     if(queue.size() == 1){
        //         answer.add(queue.peek());
        //         break;
        //     }
        //     for(int i = 0 ; i < K-1 ; i++){
        //         queue.add(queue.peek());
        //         queue.poll();
        //     }
        //     answer.add(queue.peek());
        //     queue.poll();
        //     //System.out.println(queue);
        // }
        // System.out.println(answer);
    }
}
