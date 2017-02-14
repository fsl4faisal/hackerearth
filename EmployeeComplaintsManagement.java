import java.util.*;

class EmployeeComplaintsManagement {
	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] justice=new int[N+1];
		int[] boss=new int[N+1];

		for(int i=1;i<=N;i++)
			justice[i]=scan.nextInt();

		boss[1]=0;
		for(int i=2;i<=N;i++)
			boss[i]=scan.nextInt();

		int Q=scan.nextInt();

		for(int query=0;query<Q;query++){
			int x=scan.nextInt();
			Map<Integer,Integer> bossList1=new HashMap<Integer,Integer>();
			bossList1.put(1,justice[1]);
			while(x!=1){
				//System.out.println(x+" "+boss[x]+" "+justice[boss[x]]);
				bossList1.put(boss[x],justice[boss[x]]);
				x=boss[x];
			}

			int y=scan.nextInt();
			Map<Integer,Integer> bossList2=new HashMap<Integer,Integer>();
			bossList2.put(1,justice[1]);
			while(y!=1){
				bossList2.put(boss[y],justice[boss[y]]);
				y=boss[y];
			}

			Map<Integer,Integer> commonBoss = new HashMap<Integer,Integer>();
			
			for(int key:bossList1.keySet()){
				if(bossList2.containsKey(key))
					commonBoss.put(key,bossList1.get(key));
			}

			// System.out.println("bossList1:"+bossList1);
			// System.out.println("bossList2:"+bossList2);
			// System.out.println("commonBoss:"+commonBoss);
			int max=Integer.MIN_VALUE;

			for(int key:commonBoss.keySet()){
				if(max<commonBoss.get(key))
					max=commonBoss.get(key);
			}
			//System.out.println("\nboss:");
			System.out.println(max);

		}

	}
}
