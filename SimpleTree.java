import java.util.Scanner; // I'm having vivid 151 flashbacks
import java.io.File;

public class SimpleTree
{
    public Node root = new Node();

    // we were given a constant branching factor and number of levels for this problem
    public SimpleTree(String filename) throws Exception{
        Scanner scan = new Scanner(new File(filename));
        scan.useDelimiter(", ");

        // create the nodes. This is really really hardcoded
        for (int i=0; i<3; i++){
            Node new_node = new Node(root);
            root.addNode(new_node);

            // add the child nodes for this node
            for (int j=0; j<3; j++){
                Node leaf_node = new Node(new_node);
                leaf_node.data = Integer.parseInt(scan.next());
                new_node.addNode(leaf_node);
            }
            
        }        
    }

    // DFS print tree
    public void printTree(Node n){
        if (n.children.size() == 0){
            System.out.println(n.data);
        }else{
            for (int i = 0; i<n.children.size(); i++){
                printTree(n.getChild(i));
            }
            System.out.println(n.data);
        }
    }


   
}
