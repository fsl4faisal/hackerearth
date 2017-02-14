import java.util.*;

class AliceBobAndXOR {

	public static int XORSeries(int number){
		if(number%4==0)
			return number;
		if(number%4==1)
			return 1;
		if(number%4==2)
			return number+1;
		return 0;
	}
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int testcase=0;testcase<T;testcase++){
        	int L=scan.nextInt();
        	int R=scan.nextInt();

        	int temp=XORSeries(L-1)^XORSeries(R);
        	System.out.println(temp);
        }

    }
}
