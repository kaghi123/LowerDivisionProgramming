package lab7;

public class Lab7s1 {

    public static void main(String[] args) {
        BST bst = new BST();
        AVLTree a = new AVLTree();
        
        bst.insert(3);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.insert(1);
        bst.insert(0);
        bst.insert(2);
        bst.insert(15);
        bst.insert(78);
        bst.insert(43);
        bst.insert(90);
        bst.insert(12);
        bst.insert(54);
        bst.insert(23);
        
        
        a.insert(3);
        a.insert(4);
        a.insert(6);
        a.insert(8);
        a.insert(1);
        a.insert(0);
        a.insert(2);
        a.insert(15);
        a.insert(78);
        a.insert(43);
        a.insert(90);
        a.insert(12);
        a.insert(54);
        a.insert(23);
        
        
        System.out.println(bst.getSize());
        bst.breadthFirstTraversal();
        System.out.println(bst.getNumberOfLeaves(bst.root));
        System.out.println(bst.getNumberOfNonLeaves());
        System.out.println(a.find(12));
        
        
        
    }
    
}
