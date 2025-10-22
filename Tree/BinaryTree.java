package Tree;

import java.util.*;

public class BinaryTree{
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root = CreateTree();
    }
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s = "";
        s = "<----"+nn.val+"---->";
        if(nn.left != null){
            s = nn.left.val + s;
        }
        else{
            s = "."+s;
        }
        if(nn.right != null){
            s = s + nn.right.val;
        }
        else{
            s = s+ ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    public int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        return Math.max(node.val, Math.max(lmax, rmax));
    }
    public boolean find(int item){
        return find(this.root, item);
    }
    private boolean find(Node nn, int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node node){
        if(node == null){
            return -1;
        }
        int lh = ht(node.left);
        int rh = ht(node.right);
        return Math.max(lh, rh)+1;
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.val+" ");
        InOrder(node.right);
    }
    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }
    private void PostOrder(Node node){
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val+" "); 
    }
    public void levelOrder(){
        //LinkedList<Node> q = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.remove(); //remove first
            System.out.print(rv.val+" ");
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}

