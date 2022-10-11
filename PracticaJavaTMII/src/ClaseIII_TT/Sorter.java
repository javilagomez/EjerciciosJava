package ClaseIII_TT;

import java.util.Comparator;

public interface Storer<T> {
    public void sort(T arr[], Comparator<T> c);
}
