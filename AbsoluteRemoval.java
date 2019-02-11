import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AbsoluteRemoval {


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new FileReader("C:\\Users\\mdfaisal\\git\\hackerearth\\input.txt"));

		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			int minSum = Integer.MAX_VALUE;
			//Long.M
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < N; j++)
				list.add(scanner.nextInt());

			for (int index = 0; index < list.size(); index++) {
				int temp = list.remove(index);
				int sum = 0;
				for (int l = 0; l < list.size() - 1; l++) {
					sum += Math.abs(list.get(l) - list.get(l + 1));
				}
				if (sum < minSum)
					minSum = sum;
				list.add(index, temp);
			}
			System.out.println(minSum);
		}

	}
}
