
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class pgcon3_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str1 = input.readLine( );
		int n = Integer.parseInt(str1);
		String[] list1 = new String[n];
		for(int i=0; i<n; i++){
			list1[i] = input.readLine( );
		}
		String str2 = input.readLine( );
		int m = Integer.parseInt(str2);
		ArrayList list = new ArrayList();
		while(input.ready()){
			list.add(input.readLine());
		}
		while(list.size()<m){
			list.add("");
		}
		String[] list2 = new String[m];
		for(int i=0; i<m; i++){
			list2[i] = (String) list.get(i);
		}

		ArrayList<ArrayList<Integer>> match = new ArrayList<ArrayList<Integer>>();

		for(int i=0; i<m; i++){
			ArrayList<Integer> matchnumber = new ArrayList<Integer>();
			if(list2[i].startsWith("%") && list2[i].endsWith("%")){
				String str = list2[i].substring(1, list2[i].length()-1);
				for(int j=0; j<n; j++){
					if(list1[j].indexOf(str) != -1){
						matchnumber.add(j+1);
					}
				}
			}else if(list2[i].startsWith("%")){
				for(int j=0; j<n; j++){
					if(list1[j].endsWith(list2[i].substring(1))){
						matchnumber.add(j+1);
					}
				}
			}else if(list2[i].endsWith("%")){
				for(int j=0; j<n; j++){
					if(list1[j].startsWith(list2[i].substring(0, list2[i].length()-1))){
						matchnumber.add(j+1);
					}
				}
			}else{
				for(int j=0; j<n; j++){
					if(list1[j].equals(list2[i])){
						matchnumber.add(j+1);
					}
				}
			}
			match.add(matchnumber);
		}

		for(int i=0; i<m; i++){
			if(match.get(i).size()==0){
				System.out.println("Not match");
			}else{
				for(int j=0; j<match.get(i).size(); j++){
					System.out.print(match.get(i).get(j));
					if(j==match.get(i).size()-1){
						System.out.println();
					}else{
						System.out.print(" ");
					}
				}
			}
		}
	}
}
