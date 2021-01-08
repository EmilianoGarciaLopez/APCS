import java.util.ArrayList;
import java.util.Random;

public class Chapter11 {
    // 1a - True
    // 1b - True
    // 1c - False
    // 1d - True


    // 2a - True
    // 2b - False TODO
    // 2c - False TODO
    // 2d - False TODO Check Recording

    /* 3
    An Array is faster and more efficient. It is also easier to initialize with
    starting values. For example: double[] myList = {1.9, 2.9, 3.4, 3.5};
    It is also better if you prefer to store primative data and know how
    many items you want to store.
     */

    //4 this will  print {0, 1, 2, 0, 1, 2}

    //5

    public ArrayList<String> reverseList(ArrayList<String> words) {

        ArrayList<String> newList = new ArrayList<>();
        for (String s : words) {
            newList.add(0, s);
        }
        return newList;
    }

    //6
    public static void removeSmallest(ArrayList<Integer> list) {
        if (list.size() > 0) {
            int MIN = list.get(0);
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < MIN) {
                    MIN = list.get(i);
                    index = i;
                }
            }
            list.remove(index);
        }
    }

    //7
    public static void removeDuplicates(ArrayList<Object> list1, ArrayList<Object> list2) {
        for (Object o : list2) {
            for (int i = list1.size() - 1; i > 0; i--) {
                if (list1.get(i) == o) {
                    list1.remove(i);
                }
            }
        }
    }

    //8
    /*
        ArrayList<Object> listWithinList = new ArrayList<>();
        listWithinList.add(listWithinList);
     */
    // This works, but is not recommended

    //10
    public static void removeConsecutiveDuplicates(ArrayList<String> lst) {
        //run loop backwards
        for (int i = lst.size() - 1; i > 0; i--) {
            if (lst.get(i).equals(lst.get(i - 1)))
                lst.remove(i);
        }
    }


    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }


    }
}
