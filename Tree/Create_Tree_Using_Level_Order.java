package Tree;

import java.util.*;

public class Create_Tree_Using_Level_Order {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;
    public Create_Tree_Using_Level_Order(){
        createTree();
    }
    private void createTree(){
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        int e = sc.nextInt();
        Node node = new Node(e);
        root = node;
        q.add(node);
        while (!q.isEmpty()) {
            Node rv = q.poll();//remove first
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1 != -1){
                Node nn = new Node(c1);
                rv.left = nn;
                q.add(nn);
            }
            if(c2 != -1){
                Node nn = new Node(c2);
                rv.right = nn;
                q.add(nn);
            }
        }
        sc.close();
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
    public static void main(String[] args){
        Create_Tree_Using_Level_Order cl = new Create_Tree_Using_Level_Order();
        cl.Display();
    }
}

//10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1
