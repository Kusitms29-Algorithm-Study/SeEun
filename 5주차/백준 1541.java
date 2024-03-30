import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        int sum = Integer.MAX_VALUE;

        String[] subtraction = str.split("-");

        for(int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            String[] addition = subtraction[i].split("\\+");

            for(int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}