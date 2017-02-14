/*
The Monk learned about priority queues recently and asked his teacher for an interesting problem. So his teacher came up with a simple problem. He now has an integer array A. For each index i, he wants to find the product of the largest, second largest and the third largest integer in the range [1,i].
Note: Two numbers can be the same value-wise but they should be distinct index-wise.

Input:
The first line contains an integer N, denoting the number of elements in the array A.
The next line contains N space separated integers, each denoting the ith integer of the array A.

Output:
Print the answer for each index in each line. If there is no second largest or third largest number in the array A upto that index, then print "-1", without the quotes.

Constraints:
1 <= N <= 100000
0 <= A[i] <= 1000000
*/


import java.util.*;

class MonkandMultiplication {
	
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        	arr[i]=scan.nextInt();

        long[] result=new long[N];

        long[] heap=new long[4];
    
        for(int i=0;i<N;i++){
        	if(i==0 || i==1){
                result[i]=-1;
                insert(heap,arr[i]);
            }
        	else{
                insert(heap,arr[i]);
                //display(heap);
        		result[i]=getProductMax(heap);
        	}
        }

        display(result);
    }

    public static void display(long[] arr){

    	for(int i=0;i<arr.length;i++)
    		System.out.println(arr[i]+" ");
    	
    }

    public static long getProductMax(long[] arr){
    	return arr[1]*arr[2]*arr[3];
    }

    public static void insert(long[] arr,int element){
        if(element<arr[0])
            return;
        arr[0]=element;
        heapify(arr,4,0);
    }

    // public static int removeMax(int[] arr,int N){
    // 	int max=arr[0];
    // 	swap(arr,0,N-1);
    // 	heapify(arr,N-1,0);
    	
    // 	return max;

    // }

    public static void heapify(long[] arr,int N,int i){
    	int smallest=i;
    	int left=2*i+1;
    	int right=2*i+2;

    	if(left<N && arr[left]<arr[smallest])
    		smallest=left;
    	if(right<N && arr[right]<arr[smallest])
    		smallest=right;
    	if(smallest!=i){
    		swap(arr,i,smallest);
    		heapify(arr,N,smallest);
    	}
    }

    public static void swap(long[] arr,int i,int j){
    	long temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }



}
