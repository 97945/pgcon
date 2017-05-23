
package procon.pgcon4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class pgcon3_4 {

	static String[] target;

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String strN = input.readLine( );
		int n = Integer.parseInt(strN);
		target = new String[n];
		for(int i=0; i<n; i++){
			target[i] = input.readLine( );
		}
		String strM = input.readLine( );
		int m = Integer.parseInt(strM);
		ArrayList list = new ArrayList();
		while(input.ready()){
			list.add(input.readLine());
		}
		while(list.size()<m){
			list.add("");
		}
		String[] searchWord = new String[m];
		for(int i=0; i<m; i++){
			searchWord[i] = (String) list.get(i);
			search(searchWord[i]);
		}




	}

	public static void search(String searchWord){
		String word = "";
		ArrayList<Integer> answer = new ArrayList<Integer>();
		if(searchWord.startsWith("%") && searchWord.endsWith("%")){
			word = searchWord.substring(1, searchWord.length()-1);
			for(int i=0; i<target.length; i++){
				if(target[i].indexOf(word) != -1){
					answer.add(i+1);
				}
			}
		}else if(searchWord.startsWith("%")){
			word = searchWord.substring(1);
			for(int i=0; i<target.length; i++){
				if(target[i].endsWith(word)){
					answer.add(i+1);
				}
			}
		}else if(searchWord.endsWith("%")){
			word = searchWord.substring(0, searchWord.length()-1);
			for(int i=0; i<target.length; i++){
				if(target[i].startsWith(word)){
					answer.add(i+1);
				}
			}
		}else{
			word = searchWord;
			for(int i=0; i<target.length; i++){
				if(target[i].equals(word)){
					answer.add(i+1);
				}
			}
		}
		if(answer.size() == 0){
			System.out.println("Not match");
		}else{
			for(int i=0; i<answer.size(); i++){
				System.out.print(answer.get(i));
				if(i == answer.size()-1){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
		}
	}
}
