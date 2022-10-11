package ClaseIII_PracticaJavaTT;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = {6,1,8,2,5,3,4};
        QuickSortSorterImple order = new QuickSortSorterImple();
        Comparator c = null;
        order.sort(arr, c);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
