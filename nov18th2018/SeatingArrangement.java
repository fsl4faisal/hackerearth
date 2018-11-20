package nov18th2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class SeatingArrangement {

	public static void main(String[] args) throws Exception {

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(buffer.readLine());

		for (int i = 0; i < T; i++) {
			int number = Integer.parseInt(buffer.readLine());
			int remainder=number%12;
			
			switch(remainder){
			case 0:
				System.out.println(number-11+" WS");
				break;
			case 1:
				System.out.println(number+11+" WS");
				break;
			case 2:
				System.out.println(number+9+" MS");
				break;
			case 3:
				System.out.println(number+7+" AS");
				break;
			case 4:
				System.out.println(number+5+" AS");
				break;
			case 5:
				System.out.println(number+3+" MS");
				break;
			case 6:
				System.out.println(number+1+" WS");
				break;
			case 7:
				System.out.println(number-1+" WS");
				break;
			case 8:
				System.out.println(number-3+" MS");
				break;
			case 9:
				System.out.println(number-5+" AS");
				break;
			case 10:
				System.out.println(number-7+" AS");
				break;
			case 11:
				System.out.println(number-9+" MS");
				break;
			}
			
		}

	}
}
