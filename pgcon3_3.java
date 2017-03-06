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

		int[] list2 = new int[s];
		String[] list3 = new String[m];
		for(int i=0; i<m; i++){
			long x = n + i -1;

		for(int j=0; j<s; j++){
			list2[j] = (int)(x % len);
			x = x / len;
		}
		list3[i] = "";
		for(int j=s-1; j>=0; j--){
			list3[i] = list3[i] + list[list2[j]];
		}

		System.out.println(list3[i]);
		}
	}
}
