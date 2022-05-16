package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class p1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        String number = br.readLine();
        for (int i = 0; i < number.length(); i++) {
            list.add(Integer.parseInt(number.substring(i, i + 1)));
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int s : list) {
            bw.write(s + "");
        }
        bw.flush();
        bw.close();
    }
}
