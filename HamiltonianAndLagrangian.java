import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HamiltonianAndLagrangian {

	public static void main(String[] args) throws IOException {

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		buffer = new BufferedReader(new FileReader("C:\\Users\\mdfaisal\\git\\hackerearth\\input.txt"));

		int n = Integer.parseInt(buffer.readLine());
		int[] arr = Arrays.stream(buffer.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Integer> ans = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			int j = arr.length - 1;
			for (; j > i; j--) {
				if (arr[j] > arr[i])
					break;
			}
			if (i == j)
				ans.add(arr[i]);
		}
		for (int i = ans.size()-1; i >=0; i--)
			System.out.print(ans.get(i) + " ");
	}
}
