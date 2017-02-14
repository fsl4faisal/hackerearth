import java.util.*;

class MonkAndSomeQueries {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();

        Queue<Integer> minPQ=new PriorityQueue<Integer>();
        Queue<Integer> maxPQ=new PriorityQueue<Integer>();
        

        for(int i=0;i<Q;i++){
        	int type=scan.nextInt();
        	if(type==1){
        		int X=scan.nextInt();
        		minPQ.add(X);
        		maxPQ.add(-X);
        	}
        	else if(type==2){
        		int X=scan.nextInt();
        		boolean present=minPQ.remove(X);
        		if(present==true)
        			maxPQ.remove(-X);
        		else
        			System.out.println("-1");
        	}
        	else if(!maxPQ.isEmpty() && type==3)
        		System.out.println((-maxPQ.peek()));
        	else if(!minPQ.isEmpty() &&type==4)
        		System.out.println(minPQ.peek());
        	else
        		System.out.println("-1");
        }

    }

    
}
