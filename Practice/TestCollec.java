package Practice;

import java.lang.reflect.Array;
import java.util.*;

public class TestCollec {
    public static void testArrayList(){
        // test Add
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);
        list.add(1,"c");
        System.out.println(list.contains("b"));
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        //test make list
        ArrayList<String> list1 = new ArrayList<>(List.of("a1","b1","c1"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a2","b2","c2"));
        System.out.println(list1);
        System.out.println(list2);

        // test 2d list
        ArrayList<String> list3 = new ArrayList<>(List.of("a","b"));
        ArrayList<String> list4 = new ArrayList<>(List.of("c","d"));

        ArrayList<ArrayList<String>> d2list = new ArrayList<>();
        d2list.add(list3);
        d2list.add(list4);
        for(int i=0;i<d2list.size();i++){
            ArrayList l = d2list.get(i);
            for(int j=0;j<l.size();j++){
                System.out.println(l.get(j));
            }
        }

        //test sansyo
        ArrayList<Integer> oriList = new ArrayList<>(List.of(1,2));
        ArrayList<Integer> copyList = oriList;
        copyList.add(3);
        oriList.set(1, 5);
        System.out.println(oriList);
        System.out.println(copyList);


    }
}
