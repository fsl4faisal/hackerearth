import java.util.*;

class TheFootballFest {

	public static void initialize(int[] arr,int item){
		arr[0]=item;
		arr[1]=Integer.MIN_VALUE;
	}
	public static void swap(int[] arr){
		int temp=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
	}
	public static void insert(int[] arr,int item){
		if(arr[1]==Integer.MIN_VALUE)
			arr[1]=item;
		else{
			swap(arr);
			arr[1]=item;	
		}
		
	}

	public static void back(int[] arr){
		swap(arr);
	}
	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for(int testcase=0;testcase<T;testcase++){
			int N=scan.nextInt();
			int initialPlayer=scan.nextInt();
			int[] arr=new int[2];

			arr[0]=initialPlayer;

			for(int i=1;i<=N;i++){
				char ch=scan.next().charAt(0);
				if(ch=='P')
					insert(arr,scan.nextInt());
				else if(ch=='B')
					back(arr);	
			}
			// System.out.println();
			// for(int i:arr)
			// 	System.out.print(i+" ");
			// System.out.println();
			System.out.println("Player "+arr[1]);
		}

	}
}
