import java.util.*;

class LittleMonkandVirat {
	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		PriorityQueue<Integer> oDI=new PriorityQueue<Integer>();
		PriorityQueue<Integer> t20=new PriorityQueue<Integer>();
		PriorityQueue<Integer> test=new PriorityQueue<Integer>();

		for(int i=0;i<N;i++)
			oDI.add(scan.nextInt());

		for(int i=0;i<N;i++)
			t20.add(scan.nextInt());

		for(int i=0;i<N;i++)
			test.add(scan.nextInt());        

		int Q=scan.nextInt();

		for(int query=0;query<Q;query++){
			int k=scan.nextInt();

			if(k<=N){
				

				PriorityQueue<Integer> oDITemp=new PriorityQueue<Integer>(oDI);
				PriorityQueue<Integer> t20Temp=new PriorityQueue<Integer>(t20);
				PriorityQueue<Integer> testTemp=new PriorityQueue<Integer>(test);

				for(int i=1;i<k;i++){
					oDITemp.remove();
					t20Temp.remove();
					testTemp.remove();
				}
				int min1=oDITemp.remove();
				int min2=t20Temp.remove();
				int min3=testTemp.remove();
				// oDI.remove(min1);
				// t20.remove(min2);
				// test.remove(min3);

				System.out.println((min1+min2+min3));
			}else{
				System.out.println("-1");
			}
		}





	}
}
