import java.util.ArrayList;
 
public class Node{
        public Node parent;
        public ArrayList<Node> children = new ArrayList();;
        public int data;

        public Node(){
            data = -1;
        }

        public Node(Node p){
            parent = p;
            data = -1;
        }

        public void addNode(Node n){
            children.add(n);
        }

        public Node getChild(int n){
            return children.get(n);
        }
    }