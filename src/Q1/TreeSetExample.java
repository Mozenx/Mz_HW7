package Q1;

import java.util.ArrayList;
import java.util.List;
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

    //findIntersection method for finding Intersection of two sets with ArrayList.
    public static void findIntersection(TreeSet<Character> tree1, TreeSet<Character> tree2){

        List<Character> coll1 = new ArrayList<>();
        List<Character> coll2 = new ArrayList<>();
        TreeSet<Character> treeSet = new TreeSet<>();
        coll1.addAll(tree1);
        coll2.addAll(tree2);
        for(int i = 0; i < coll1.size(); i++){

            for(int j = 0; j<coll1.size();j++){

                if(coll1.get(i) == coll2.get(j)){
                    treeSet.add(coll1.get(i));
                }
            }
        }//end of for

        System.out.println("\nIntersection of two sets used ArrayList.\n"+treeSet);

    }//end of findCommon method
}
