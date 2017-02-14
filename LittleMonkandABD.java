import java.util.*;

class LittleMonkandABD {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Queue<Integer> minQueue=new PriorityQueue<Integer>();
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++)
        	minQueue.add(scan.nextInt());
   
        int Q=scan.nextInt();

        for(int i=0;i<N;i++)
        	arr[i]=minQueue.remove();


        for(int i=0;i<Q;i++){
        	int kth=scan.nextInt();
        	char ch=scan.next().charAt(0);
        	if(ch=='S'){
        		System.out.println(arr[kth-1]);
        	}
        	else if(ch=='L'){
        		System.out.println(arr[N-kth]);	
        	}
        }


    }
}
