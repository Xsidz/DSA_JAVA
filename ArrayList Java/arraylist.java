import java.util.*;
public class arraylist {

    public static void Swapvariable(ArrayList<Integer> list,int idx1,int idx2){


        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        list.get(0);
        list.get(1);

        list.size();

        // list.remove(0);
        // list.remove(3);

        list.set(0,1);
        list.set(3,10);

        System.out.println(list);
        Swapvariable(list, 0, 4);
        System.out.println(list);

        Collections.sort(list); // default optimizwd way to sort the arraylist
        System.out.println(list);

        Collections.sort(list , Collections.reverseOrder()); // sort in the descending order 
        //Collections.reverseOrder is a comparator function that defines a logic for function

        //2-D arrayList

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        main.add(arr);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        main.add(arr2);

        for (int i = 0; i < main.size(); i++) {
            ArrayList<Integer> currList = main.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println(" ");
        }
     }
}
