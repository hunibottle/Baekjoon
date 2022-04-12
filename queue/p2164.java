package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class p2164 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = i+1;
        }
        Queue<Integer> queue =  new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++){
            queue.add(arr[i]);
        }

        while(true){
            if(N == 1){
                break;
            }else if(N == 2){
                queue.poll();
                break;
            }else{
                queue.poll();
                queue.add(queue.peek());
                queue.poll();
            }
            if(queue.size() == 1){
                break;
            }
        }
        System.out.println(queue.peek());
    }
}

