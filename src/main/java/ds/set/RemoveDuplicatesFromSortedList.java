package ds.set;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by skupunarapu on 12/9/2015.
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ab");
        al.add("ab");
        al.add("ac");
        al.add("bv");
        al.add("bv");
        al.add("bz");
        al.add("ca");
        al.add("ca");

        ArrayList<String> sl =removeDuplicates(al);
        for (String s : sl) {
            System.out.println(s);
        }

    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> al) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.addAll(al);
        al.clear();
        al.addAll(ts);
        return al;
    }
}
