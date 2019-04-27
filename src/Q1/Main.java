package Q1;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //declare two treeSets
        TreeSet<Character> test1 = new TreeSet<>();
        TreeSet<Character> test2 = new TreeSet<>();

        //fill and print two declared treeSets
        System.out.println("TreeSet 1:\n"+TreeSetExample.addChar(test1));
        System.out.println("TreeSet 2:\n"+TreeSetExample.addChar(test2));

        //use method of TreeSetExample
        TreeSetExample.findUnion(test1,test2);
        TreeSetExample.findIntersection(test1,test2);
        TreeSetExample.find(test1, test2);

    }

}//end of class
