import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

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
		DecimalFormat format = new DecimalFormat("#.#");
        format.setMinimumFractionDigits(3);
        format.setMaximumFractionDigits(3);
        BigDecimal number = new BigDecimal(double5);

		String str5 = String.format("%9s",  format.format(number));
		System.out.print(str5);
		System.out.println();

		}
}




