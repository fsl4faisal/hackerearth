import java.util.*;

class MonkAndHisFriends {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int testcase=0;testcase<T;testcase++){
        	int N=scan.nextInt();
        	int M=scan.nextInt();

        	Set<Long> set=new HashSet<Long>();

        	for(int i=0;i<N;i++)
        		set.add(scan.nextLong());
        	for(int i=0;i<M;i++){
        		long candies=scan.nextLong();
        		if(set.contains(candies))
        			System.out.println("YES");
        		else{
        			System.out.println("NO");
        			set.add(candies);
        		}
        	}
        }

    }
}
