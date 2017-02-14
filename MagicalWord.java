import java.util.*;

class MagicalWord {
	public static final int R=127;
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        boolean[] arr=new boolean[R];
        //int a[]={67,71,73,79,83,89,97,101, 103, 107, 109, 113};
        primeNumbers(arr);
        //display(arr);
        for(int testcase=0;testcase<T;testcase++){
        	int N=scan.nextInt();
        	String str=scan.next();

        	String output=changeString(str,arr);
        	System.out.println(output);
        	// for(int i=0;i<output.length;i++)
        	// 	System.out.print((char)output[i]);
        	// System.out.println();

        	// for(int i=0;i<output.length;i++)
        	//  	System.out.println(str.charAt(i)+" "+(int)str.charAt(i)+" "+output[i]+" "+(char)output[i]);
        }
        
    }

    public static void primeNumbers(boolean[] arr){
    	int counter=0;
    	//int a[]={67,71,73,79,83,89,97,101, 103, 107, 109, 113};
    	for(int i=65;i<122;i++){
    		int j=2;
    		for(;j<i/2;j++){
    			if(i%j==0)
    				break;
    		}
    		if(j==i/2)
    			arr[i]=true;
    	}
    }

    public static String changeString(String str,boolean[] arr){
    	//int[] output=new int[str.length()];
    	String output="";
    	// System.out.println("output.length:"+output.length);
    	// System.out.println("str.length():"+str.length());
    	//int counter=0;
    	for(int i=0;i<str.length();i++){
    		if(arr[str.charAt(i)]==true)
    			output+=Character.toString(str.charAt(i));//output[counter]=str.charAt(i);
    		else{
    			int upwardCounter=str.charAt(i);
    			int downwardCounter=str.charAt(i);
    			
    			while(true){
    				--upwardCounter;
    				++downwardCounter;
    				if(upwardCounter>=67 && arr[upwardCounter]==true)
    					break;
    				if(downwardCounter<=113 && arr[downwardCounter]==true)
    					break;
    			}
    			// System.out.println(str.charAt(i));
    			// System.out.println("upwardCounter downwardCounter");
    			// System.out.println(upwardCounter+" "+downwardCounter);

    			if(arr[upwardCounter]==true)
    				output+=Character.toString((char)upwardCounter);//	output[counter]=upwardCounter;
    			else if(arr[downwardCounter]==true)
    				output+=Character.toString((char)downwardCounter); //output[counter]=downwardCounter;
    			else
    				System.out.println("I am here");
    		}
    		//counter++;
    	}

    	return output;

    }
    public static void display(boolean[] arr){
    	for(int i=0;i<R;i++)
    		System.out.println(i+" "+arr[i]);
    }
}
