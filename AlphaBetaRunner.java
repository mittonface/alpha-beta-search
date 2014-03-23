public class AlphaBetaRunner
{
    public static void main(String[] args) throws Exception{

        SimpleTree st = new SimpleTree("UtilityValues.txt");
        st.printTree(st.root);
    }

    public static int ab_search(Node n){
        int val = max_value(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
         
        return val;
    }

    public static int max_value(Node n, int alpha, int beta){
        // in this abstract example we don't calculate utility values.
        // -1 means a non leaf
        System.out.println("Visiting " + n.data);
        if (n.data != -1)
            return n.data;
        
        int val = Integer.MIN_VALUE;
        // loop through each child (action)
        for (int i=0; i<n.children.size(); i++){
            val = Math.max(val, min_value(n.getChild(i), alpha, beta));
            if (val >= beta)
                return val;
            alpha = Math.max(alpha, val);
        }
        return val;
    }

    public static int min_value(Node n, int alpha, int beta){
        // in this abstract example we don't calculate utility values.
        // -1 means a non leaf
        System.out.println("Visiting " + n.data);
        if (n.data != -1)
            return n.data;

        int val = Integer.MAX_VALUE;
        // loop through each child (action)
        for (int i=0; i<n.children.size(); i++){
            val = Math.min(val, max_value(n.getChild(i), alpha, beta));
            if (val <= alpha)
                return val;
            beta = Math.min(beta, val);
        }

        return val;
    }


  
}
