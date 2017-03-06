package procon.pgcon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class pgcon3_2 {


	public static class Card {
		private String card;
		private Long rank;
		public Card(String card, Long rank){
			this.card = card;
			this.rank = rank;
		}
		public String getCard(){ return card; }
		public void setCard(String card){ this.card = card; }
		public Long getRank() { return rank; }
		public void setRank(Long rank) { this.rank = rank; }
	}


	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = read.readLine();
		String[] list = str.split(" ");
		long[] longlist = new long[list.length];
		Long rev = (long) 0;
		int check = 0;
		Card[] sortlist = new Card[list.length];

		for(int i=0; i<list.length; i++){


			if (list[i].startsWith("0x")) {
				check = check+1;
				String str2 = list[i].substring(2, list[i].length());
				rev = (new java.math.BigInteger(str2, 16)).longValue();
				String binary = Integer.toBinaryString(rev.intValue());
				if(binary.startsWith("1") && binary.length()==16){
					binary = binary.substring(1);
					rev = (long) (Integer.parseInt(binary,2) - 32768);
				}

			}else {
				rev = Long.parseLong(list[i]);
			}
			sortlist[i] = new Card(list[i], rev);
		}

		Arrays.sort(sortlist, new Comparator<Card>() {
			public int compare(Card card1, Card card2) {
				return (int) (card1.getRank() - card2.getRank());
			}
		});


		for(int i=0; i<longlist.length; i++){
				System.out.print(sortlist[i].getCard());
			if(i==longlist.length-1){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		}
}
