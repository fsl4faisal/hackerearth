import java.util.*;

class NumberRoots {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int testcase=0;testcase<T;testcase++){
        	long N=scan.nextLong();
        	long M=scan.nextLong();

        	double root=Math.pow((double)M,1.0/(double)N);
        	if(root==Math.ceil(root))
        		System.out.println((long)root);
        	else{
        		System.out.println(root);
        		System.out.println("-1");
        	}

        }

    }
}
