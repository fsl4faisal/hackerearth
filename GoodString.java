import java.util.*;

class GoodString {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int length=str.length();

        Set<Character> set=new HashSet<Character>();

        for(int i=0;i<length;i++)
        	set.add(str.charAt(i));

        System.out.println(length-set.size());

    }
}
