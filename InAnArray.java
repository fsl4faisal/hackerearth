import java.util.*;

class InAnArray {

	private static class Pair{
		int i;
		int j;

		Pair(int i,int j){
			this.i=i;
			this.j=j;
		}

		@Override
		public boolean equals(Object o) {

        // If the object is compared with itself then return true  
			if (o == this) {
				return true;
			}

        /* Check if o is an instance of Complex or not
        "null instanceof [type]" also returns false */
        if (!(o instanceof Pair)) {
        	return false;
        }

        // typecast o to Complex so that we can compare data members 
        Pair other = (Pair) o;

        // Compare the data members and return accordingly 
        return this.i==other.i && this.j==other.j;
    	}

    	public String toString(){
    		return "("+i+","+j+")";
    	}
	}
public static void main(String args[] ) throws Exception {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int K=scan.nextInt();
	int X=scan.nextInt();
	int Y=scan.nextInt();

	int[] arr=new int[N];

	for(int i=0;i<N;i++)
		arr[i]=scan.nextInt();

	long counter=0;
	HashMap<Pair,Integer> map=new HashMap<Pair,Integer>();
	java.util.Arrays.sort(arr);
	for(int i:arr)
		System.out.println(i+" ");
	System.out.println();

	System.out.println(new Pair(1,2).equals(new Pair(1,2)));
	for(int i=0;i<N;i++){
		for(int j=i+1;j<N;j++){

			Pair pair=new Pair(arr[i],arr[j]);
			int count=0;
			if(map.containsKey(pair))
				count=map.get(pair);

			map.put(pair,++count);

		}
	}
	System.out.println(map);

	for(Pair pair:map.keySet()){
		int varient1=(pair.i+pair.j)%K;
		int varient2=(pair.i*pair.j)%K;
		if(varient1==X && varient2==Y)
			counter++;
	}

	System.out.println(counter);

}
}
