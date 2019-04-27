package Q1;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {


    //adding 10 random char to the TreeSet object
    public static TreeSet<Character> addChar(TreeSet<Character> treeSet){

        Random rn = new Random();
        while (!(treeSet.size() == 10)){
            char ch = (char)(rn.ints(97,122+1).findFirst().getAsInt());
            treeSet.add(ch);
        }
        return treeSet;
    }//end of addChar method

    //findUnion method for finding Union of two sets.
    public static void findUnion(TreeSet<Character> tree1, TreeSet<Character> tree2){

        TreeSet<Character> addTree = new TreeSet<>();
        addTree.addAll(tree1);
        addTree.addAll(tree2);

        System.out.println("\nUnion of two sets:\n"+addTree);

    }//end of findUnion
}
