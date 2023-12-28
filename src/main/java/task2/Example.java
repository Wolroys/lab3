package task2;

import task2.someClasses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        List<Animal> animals = CollectionUtils.newArrayList();
//
//        CollectionUtils.add(animals, new Dog());
//        CollectionUtils.add(animals, new Pinguin());
//
//        List<Animal> cats = CollectionUtils.newArrayList();
//
//        CollectionUtils.add(cats, new Cat());
//        CollectionUtils.add(cats, new Cat());
//
//        CollectionUtils.addAll(cats, animals);
//
//        animals.forEach(animal -> System.out.println(animal.getClass().getSimpleName()));
//
//        System.out.println(CollectionUtils.range(Arrays.asList(8, 1, 3, 5, 6, 4), 3, 6));
//
//        System.out.println(CollectionUtils.range(Arrays.asList(8, 1, 3, 5, 6, 4), 3, 6,
//                Comparator.naturalOrder()));
//
        List<String> list = CollectionUtils.newArrayList();
        CollectionUtils.add(list, "str1");

        System.out.println(list);

        List<String> list2 = CollectionUtils.newArrayList();

        CollectionUtils.add(list2, "cat");
        CollectionUtils.add(list2, "dog");
        CollectionUtils.addAll(list2, list);
        System.out.println(list);
        System.out.println(CollectionUtils.indexOf(list, "dog"));

        System.out.println(CollectionUtils.containsAll(list, list2));

        System.out.println(CollectionUtils.range(list, "cat", "dog"));
    }
}
