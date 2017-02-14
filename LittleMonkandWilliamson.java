
import java.util.*;

class LittleMonkandWilliamson {
	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int Q = scan.nextInt();
		PriorityQueue<Integer> minScores=new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxScores=new PriorityQueue<Integer>();
		Map<Integer,Integer> scoreCount=new HashMap<Integer,Integer>();
		for(int query=0;query<Q;query++){
			
			String strQuery=scan.next();
			if(strQuery.equals("Push")){
				int score=scan.nextInt();
				minScores.add(score);
				maxScores.add(-score);
				if(scoreCount.containsKey(score)){
					int count=scoreCount.get(score);
					scoreCount.put(score,++count);
				}
				else
					scoreCount.put(score,1);
			}
			else if(strQuery.equals("CountHigh")){
				if(!maxScores.isEmpty()){
					int score=-maxScores.peek();
					System.out.println(scoreCount.get(score));	
				}else{
					System.out.println("-1");
				}


			}else if(strQuery.equals("Diff")){
				if(!scoreCount.isEmpty()){
					int min=minScores.remove();
					int max=-maxScores.remove();
					int diff=max-min;
					System.out.println(diff);

					minScores.remove(max);
					maxScores.remove(-min);

					int minCounter=scoreCount.get(min);
					int maxCounter=scoreCount.get(max);

					if(minCounter==1)
						scoreCount.remove(min);
					else
						scoreCount.put(min,--minCounter);

					if(maxCounter==1)
						scoreCount.remove(max);
					else
						scoreCount.put(max,--maxCounter);

				}else{
					System.out.println("-1");
				}

			}else if(strQuery.equals("CountLow")){
				if(!minScores.isEmpty()){
					int score=minScores.peek();
					System.out.println(scoreCount.get(score));	
				}else{
					System.out.println("-1");
				}
			}
		}

	}
}
