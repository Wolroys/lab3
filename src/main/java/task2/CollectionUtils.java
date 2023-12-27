package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination){
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<? extends T> limit(List<? extends T> source, int size) {
        if (source.size() < size)
            return source;

        return source.subList(0, size);
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return new HashSet<>(c1).containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T v : c2) {
            if (c1.contains(v))
                return true;
        }

        return false;
    }

    public static <T extends Comparable<? super T>> List<? extends T> range(List<? extends T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        for (T v : list){
            if (v.compareTo(min) >= 0 && v.compareTo(max) <= 0)
                result.add(v);
        }

        return result;
    }

    public static <T> List<? extends T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> result = new ArrayList<>();
        for (T v : list){
            if (comparator.compare(v, min) >= 0 && comparator.compare(v, max) <= 0)
                result.add(v);
        }

        return result;
    }


}
