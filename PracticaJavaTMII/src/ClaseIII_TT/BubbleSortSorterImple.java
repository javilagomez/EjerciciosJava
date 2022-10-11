package ClaseIII_PracticaJavaTT;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Storer<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int n = arr.length;
        T temp;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (c.compare(arr[j - 1], arr[j]) > 0) {
                    //if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
