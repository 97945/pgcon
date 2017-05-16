package procon.pgcon3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pgcon3_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str1 = read.readLine();
		String[] list = str1.split("");
		int len = list.length;
		String str2 = read.readLine();
		int s = Integer.parseInt(str2);
		String str3 = read.readLine();
		long n = Long.parseLong(str3);
		String str4 = read.readLine();
		int m = Integer.parseInt(str4);

		Arrays.sort(list);

		int[] order = new int[s];
		for(int i=0; i<m; i++){
			long x = n + i -1;
			for(int j=0; j<s; j++){
				order[j] = (int)(x % len);
				x = x / len;
			}
		String answer = "";
		for(int j=s-1; j>=0; j--){
			answer = answer + list[order[j]];
		}
		System.out.println(answer);
		}
	}
}
