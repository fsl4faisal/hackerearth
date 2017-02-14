import java.util.*;

class MonkWatchingFight {
	public static int maxLevel=Integer.MIN_VALUE;
    
    class BSTNode{
    	int data;
    	int level;
    	BSTNode parent;
    	BSTNode left;
    	BSTNode right;

    	public BSTNode(int data,BSTNode parent,BSTNode left,BSTNode right,int level){
    		this.data=data;
    		this.parent=parent;
    		this.left=left;
    		this.right=right;
    		this.level=level;
    		if(level>maxLevel)
    			maxLevel=level;
    	}
    	public BSTNode(int data){
    		this(data,null,null,null,1);
    	}
    	public BSTNode(int data,BSTNode parent){
    		this(data,parent,null,null,parent.level+1);
    	}

    }

    BSTNode root;

    public void insert(int data){
    	if(root==null){
    		root=new BSTNode(data);
    		return;
    	}
    	root=insertHelper(root,root,data);
    }

    private BSTNode insertHelper(BSTNode node,BSTNode parent,int data){
    	if(node==null)
    		return new BSTNode(data,parent);
    	if(data<=node.data)
    		node.left=insertHelper(node.left,node,data);
    	else //if(data>node.data)
    		node.right=insertHelper(node.right,node,data);
    	return node;
    }

    public void printInorder(){
    	inOrderHelper(root);
    	System.out.println();
    }

    // public int maxLevel(){
    // 	int maxLevel=inOrderLevelFinder(root);
    // 	return maxLevel;
    // }

    // private inOrderLevelFinder(BSTNode node){
    	
    // }

    // private int getLevel(BSTNode node){
    // 	if(node==null)
    // 		return Integer.MIN_VALUE;
    // 	return node.level;
    // }

    private void inOrderHelper(BSTNode node){
    	if(node==null)
    		return;
    	inOrderHelper(node.left);
    	System.out.print(node.data+"("+node.level+")"+"->");
    	inOrderHelper(node.right);
    }

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        MonkWatchingFight test=new MonkWatchingFight();

        for(int i=0;i<N;i++)
        	test.insert(scan.nextInt());

        //test.printInorder();

        System.out.println(test.maxLevel);

    }
}
