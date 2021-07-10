package rxlogix.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(1);
        list1.add(56);
        list1.add(3);
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        list2.add(56);
        list2.add(8);
        list2.add(2);
        list2.add(4);
        list2.add(33);
//        for(int i=0;i<list1.size();i++){
//            for(int j=0;j<list2.size();j++){
//                if(list1.get(i)==list2.get(j)){
//                    System.out.println(list1.get(i));
//                    list2.set(j,-999);
//                    break;
//                }
//            }
//        }//brute force Time Complexity O(n^2)
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int k=0;
        for(int i=0;i<list1.size();i++){
            map.put(list1.get(i),i);
        }
        for(int i=0;i<list2.size();i++){
            if(map.containsKey(list2.get(i))){
                System.out.println(list2.get(i));
            }
        }//using hashmap time complexity (O(n))
//        for(int i:list2){
//            if(map.containsValue(list2.get(i))){
//                System.out.println(list2.get(i));
//            }
//        }

    }
}
//56,8,2,4,3
// <int> list1 = [2,4,1,56,3];