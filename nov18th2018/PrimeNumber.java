package nov18th2018;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PrimeNumber {
	public static void main(String args[]) throws Exception {

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(buffer.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= number; i++) {
			boolean flag = false;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					flag = true;
					break;
				}

			}
			if (flag == false)
				sb.append(i + " ");
		}
		System.out.println(sb.toString().trim());

	}
}
