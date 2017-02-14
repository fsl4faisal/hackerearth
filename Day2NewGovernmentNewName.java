import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Day2NewGovernmentNewName {
	public static void main(String args[] ) throws Exception {
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		String lines=buffer.readLine();
		String[] line=lines.split(" ");
		
		int N = Integer.parseInt(line[0]);
		int Q=Integer.parseInt(line[1]);

		String S=buffer.readLine();

		int[] alphabets=new int[26];

		for(int i=0;i<S.length();i++)
			alphabets[S.charAt(i)-65]++;

		int[] stringArray=new int[S.length()];

        for(int i=0;i<S.length();i++)
        	stringArray[i]=S.charAt(i);



		int[][] arr=new int[Q][3];

		for(int query=0;query<Q;query++){
        	//System.out.println("query:"+query);
			lines=buffer.readLine();
			line=lines.split(" ");

			arr[query][0]=Integer.parseInt(line[0]);
			arr[query][1]=Integer.parseInt(line[1]);
			if(line[0].equals("1"))
				arr[query][2]=line[2].charAt(0);
		}

        // System.out.println("printing query array:");
        //  for(int query=0;query<Q;query++)
        // 	  System.out.println(arr[query][0]+" "+arr[query][1]+" "+arr[query][2]);

        for(int query=0;query<Q;query++){
        	if(arr[query][0]==1){
        		int pos=arr[query][1];
        		int newChar=arr[query][2];
        		alphabets[stringArray[pos-1]-65]--;
        		stringArray[pos-1]=newChar;
        		alphabets[newChar-65]++;
        		// System.out.println("After query 1:");
        		// display(alphabets);
        	}else{
        		// System.out.println("After query 2:");
        		// display(alphabets);
        		int pos=arr[query][1];
        		int charAtpos=findCharAtPosition(alphabets,pos);
        		System.out.println((char)(charAtpos+65));
        	}
        }

	}

	public static int findCharAtPosition(int [] alphabets,int pos){
		int counter=0;
		int i=0;
		for(i=0;i<26;i++){
			counter+=alphabets[i];
			if(counter>=pos){
				break;
			}
		}
		return i;
	}

	public static void display(int[] alphabets){
		System.out.println("alphabets:");
		for(int i=0;i<26;i++)
			System.out.println((char)(i+65)+" "+alphabets[i]);
		System.out.println();
	}
}
