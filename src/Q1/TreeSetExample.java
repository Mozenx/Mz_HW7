package Q1;

import java.util.TreeSet;

public class TreeSetExample {

    //findUnion method for finding Union of two sets.
    public static void findUnion(TreeSet<Character> tree1, TreeSet<Character> tree2){

        TreeSet<Character> addTree = new TreeSet<>();
        addTree.addAll(tree1);
        addTree.addAll(tree2);

        System.out.println("\nUnion of two sets:\n"+addTree);

    }//end of findUnion
}
