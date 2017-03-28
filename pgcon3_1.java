package procon.pgcon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgcon3_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = read.readLine();
		String[] list = str.split(" ");

		String str1 = String.format("%-19s", list[0]);
		System.out.print(str1+" ");

		String str2 = String.format("%19s", list[1]);
		System.out.print(str2+" ");

		int int3 = Integer.parseInt(list[2]);
		String str3 = String.format("%09d", int3);
		System.out.print(str3+" ");

		String str4 = String.format("%9s", list[3]);
		System.out.print(str4+" ");

		double double5 = Double.parseDouble(list[4]);
		String str5 = String.format("%9.3f", double5);
		System.out.println(str5);

		}
}