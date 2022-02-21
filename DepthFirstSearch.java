
/**
 * 
 * @author Carl
 * @version 1.0
 * Assignment 6.1
 *
 */
public final class DepthFirstSearch
{
    private Node root;
    private int count;//counts the number of nodes traverse in a depth-first preorder manner.
    
    /**
     * sets the root node to null
     */ 
    public DepthFirstSearch()
    {
        this(null);
    }//end empty-argument constructor
    
    /**
     * sets the root node to the argument
     * sets count to zero
     * @param, the node to assign to the root node
     */ 
    public DepthFirstSearch(Node node)
    {
        setRoot(node);
        reset();
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }//end constructor
    
    /**
     * sets the root of a tree
     */ 
    private void setRoot(Node root)
    {
        this.root = root;
    }//end setRoot
    
    /**
     * traverse the tree in depth-first preorder manner
     */ 
    public void DFS()
    {
        depthFirstSearch(root);
        reset();
    }//end DFS
    
    /**
     * traverse the tree in depth-first preorder manner
     */ 
    public void DFS(Node node)
    {
        setRoot(node);
        DFS();
    }//end DFS(Node)
    
    /**
     * @return the height of a subtree rooted at the argument
     * @param root, the root of this subtree
     */ 
    private int height(Node root)//private
    {
        if (root!= null)
            return 1 + Math.max(height(root.getlChild()), height(root.getrChild()));
        else 
            return 0;
    }//end height
    
    /**
     * support method for the traversal of a tree in depth-first preorder manner
     */ 
    private void depthFirstSearch(Node node)
    {
        if (node != null)
        {
            count++;
            System.out.print("The value of the node is "+node.getData()+", the number of node(s) visited is "+count);
            System.out.println(" and the height of this tree is "+height(node)+".");
            depthFirstSearch(node.getlChild());
            depthFirstSearch(node.getrChild());
        }
    }//end depthFirstSearch
    
    /**
     * sets count (the number of nodes traverse) to 0
     */
    private void reset()
    {
        count = 0;
    }//end reset
}//end class