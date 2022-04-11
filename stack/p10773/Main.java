package stack.p10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());

        int[] arr = new int[k];
        for(int i = 0 ; i < k ; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                stack.add(arr[i]);
            }else{
                stack.pop();
            }
        }
        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
