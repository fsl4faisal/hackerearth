import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class BinaryQueues {
	public static void main(String[] args) throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String[] line=buffer.readLine().split(" ");
		
		StringBuilder output = new StringBuilder();

		int N=Integer.parseInt(line[0]);
		int Q=Integer.parseInt(line[1]);
 
		int[] arr=new int[N+1];
		line=buffer.readLine().split(" "); 
		int counter=0;
		for(int i=1;i<=N;i++)
			arr[i]=Integer.parseInt(line[counter++]);
 		
 		int[][] query=new int[Q][3];

		for(int j=0;j<Q;j++){
			counter=0;
			line=buffer.readLine().split(" ");
			for(String str:line)
				query[j][counter++]=Integer.parseInt(str);
		}

		for(int i=0;i<Q;i++){
			if(query[i][0]==0 && arr[query[i][2]]==0){
				output.append("EVEN\n");
			}
			else if(query[i][0]==0 && arr[query[i][2]]==1){
				output.append("ODD\n");
			}
			else if(query[i][0]==1)
				arr[query[i][1]]=1-arr[query[i][1]];
		}

		System.out.println(output);
	}
}
