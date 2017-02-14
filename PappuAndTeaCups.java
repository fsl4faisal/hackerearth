import java.util.*;

class PappuAndTeaCups {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int ones=0,zeros=0,twos=0,pairs=0,pairCounter=0;
        for(int i=0;i<N;i++){
        	int status=scan.nextInt();
        	if(status==1){
        		pairCounter++;
        		ones++;
        	}
        	else
        		zeros++;
        	if(pairCounter==2){
        		pairs++;
        		pairCounter=0;
        	}
        }

        for(int i=0;i<pairs;i++){
        	zeros++;
        	twos++;
        	ones=ones-2;
        }
        int trips=twos+ones+1;
        // System.out.println(twos);
        // System.out.println(ones);
        if(trips%2==0)
        	System.out.println(trips/2);
        else
        	System.out.println((trips+1)/2);
        

    }
}
