package ClaseIII_PracticaJavaTT;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Storer<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        arr = quicksort2(arr, 0, arr.length-1, c);
    }

    public T[] quicksort2(T arr[], int left, int right, Comparator<T> c) {
        if (left>=right)
            return arr;
        int i = left, j = right;
        if (left != right) {
            int pivot = left;
            T aux;
            while (left != right) {
                while (c.compare(arr[right], arr[pivot]) > 0 && left < right) {right--;}
                while (c.compare(arr[left], arr[pivot]) > 0 && left < right) {left--;}
                //while (arr[right] >= arr[pivot] && left < right) {right--;}
                //while (arr[left] < arr[pivot] && left < right) {left--;}

                if (right != left) {
                    aux = arr[right];
                    arr[right] = arr[left];
                    arr[left] = aux;
                }
            }
                if (left == right) {
                    quicksort2(arr, i, left - 1, c);
                    quicksort2(arr, left + 1, j, c);
                }
        } else
            return arr;
        return arr;
    }
}
