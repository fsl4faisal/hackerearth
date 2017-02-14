import java.util.*;

class MonkAndPrisonerOfAzkaban {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        long[] arr=new long[N+1];

        for(int i=1;i<=N;i++)
        	arr[i]=scan.nextLong();

        long[] arrX=new long[N+1];
        long[] arrY=new long[N+1];

        init(arrX);
        init(arrY);
        
        calculateX(arr,arrX);
        calculateY(arr,arrY);
        long[] result=calculateResult(arrX,arrY);
        display(result);
        // display(arrX);
        // display(arrY);
    }

    public static long[] calculateResult(long[] arrX,long[] arrY){
    	long[] result=new long[arrX.length];

    	for(int i=1;i<arrX.length;i++)
    		result[i]=arrX[i]+arrY[i];

    	return result;
    }

    public static void display(long[] arr){
    	//System.out.println("arr:");
    	for (int i=1; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }

    public static void calculateXUsingStack(long[] arr,long[] arrX){
    	for(int i=arr.length-1;i>=1;i--){
        	for(int j=i-1;j>=1;j--){
        		if(arr[j]>arr[i]){
        			arrX[i]=j;
        			break;
        		}
        	}
        }
    }

    public static void calculateX(long[] arr,long[] arrX){
    	for(int i=arr.length-1;i>=1;i--){
        	for(int j=i-1;j>=1;j--){
        		if(arr[j]>arr[i]){
        			arrX[i]=j;
        			break;
        		}
        	}
        }
    }

    public static void calculateY(long[] arr,long[] arrY){
    	for(int i=1;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[j]>arr[i]){
        			arrY[i]=j;
        			break;
        		}
        	}
        }
    }

    public static void init(long[] arr){
    	for(int i=1;i<arr.length;i++)
        	arr[i]=-1;
    }
}
