package procon.pgcon5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgcon3_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int n = Integer.parseInt(strlist[0]);

		int a = n / 20;

		label: for(int i=a; i>=0; i--){
			int bal = n;
			int b = 0;
			int c = 0;
			int d = 0;
			bal = bal - 20*i;
			if(bal==0){
				System.out.println(i+" 0 0 0");
				break label;
			}else{
				b = bal / 9;
				if(b<0){
					b = 0;
				}
				for(int j=b; j>=0; j--){
					bal = bal - 9*j;
					if(bal==0){
						System.out.println(i+" "+j+" 0 0");
						break label;
					}else{
						c = bal / 6;
						if(c<0){
							c = 0;
						}
						for(int k=c; k>=0; k--){
							bal = bal - 6*k;
							if(bal==0){
								System.out.println(i+" "+j+" "+k+" 0");
								break label;
							}else{
								d = bal / 4;
								if(d<0){
									d = 0;
								}
								for(int l=d; l>=0; l--){
									bal = bal - 4*l;
									if(bal==0){
										System.out.println(i+" "+j+" "+k+" "+l);
										break label;
									}else{
										bal = bal + 4*l;
									}
								}
								bal = bal + 6*k;
							}
						}
						bal = bal + 9*j;
					}
				}
			}
		}

	}
}

