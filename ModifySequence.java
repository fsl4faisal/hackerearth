import java.util.*;
import java.math.BigInteger;

class ModifySequence {
	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count=0;

		for(int i=0;i<N;i++){
			int number=scan.nextInt();
			count=number-count;
		}
		
		if(count==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
