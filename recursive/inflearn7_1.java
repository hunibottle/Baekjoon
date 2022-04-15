import java.util.*;

public class inflearn7_1{

    public void DFS(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n+" ");
            DFS(n-1);
        }
    }
    public static void main(String[] args) {
        inflearn7_1 I = new inflearn7_1();
        I.DFS(3);
    }
}