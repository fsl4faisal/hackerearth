import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MicroAndArrayUpdate {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\mdfaisal\\git\\hackerearth\\input.txt"));
		// buffer=new BufferedReader(input);
		int T = Integer.parseInt(buffer.readLine());
		String[] line;
		for (int i = 0; i < T; i++) {
			line = buffer.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);
			int[] arr = Arrays.stream(buffer.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (min > arr[j])
					min = arr[j];
			}
			if (k < min)
				System.out.println(0);
			else
				System.out.println(k - min);
		}
	}
}
