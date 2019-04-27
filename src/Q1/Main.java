package Q1;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Character> test1 = new TreeSet<>();
        TreeSet<Character> test2 = new TreeSet<>();

        System.out.println("TreeSet 1:\n"+TreeSetExample.addChar(test1));
        System.out.println("TreeSet 2:\n"+TreeSetExample.addChar(test2));

        TreeSetExample.findUnion(test1,test2);
        TreeSetExample.findIntersection(test1,test2);
        TreeSetExample.find(test1, test2);

    }

}//end of class
