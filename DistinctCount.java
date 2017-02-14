import java.util.*;


class DistinctCount {
	public static void main(String args[] ) throws Exception {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int testcase = 0; testcase < T; testcase++) {
			int N=scan.nextInt();
			int X=scan.nextInt();

			Set<Integer> set=new HashSet<Integer>();

			for(int i=0;i<N;i++)
				set.add(scan.nextInt());
			if(set.size()==X)
				System.out.println("Good");
			else if(set.size()<X)
				System.out.println("Bad");
			else
				System.out.println("Average");
		}

	}
}
