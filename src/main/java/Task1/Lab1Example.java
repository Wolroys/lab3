package Task1;

public class Lab1Example {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        CountMap<Integer> map2 = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(map.getCount(5)); // 2
        System.out.println(map.getCount(6)); // 1
        System.out.println(map.getCount(10)); // 3

        map2.add(6);
        map2.add(5);
        map2.add(10);
        map2.add(6);
        map2.add(5);
        map2.add(10);

        map.addAll(map2);

        System.out.println("------------------");
        System.out.println("After union:");

        System.out.println(map.getCount(5)); // 4
        System.out.println(map.getCount(6)); // 3
        System.out.println(map.getCount(10)); // 5


        System.out.println("Size: " + map.size()); // 3
        System.out.println("Removing 10: " + map.remove(10)); // 5

        System.out.println("--------");
        System.out.println("After removing: ");

        System.out.println(map.getCount(5)); // 4
        System.out.println(map.getCount(6)); // 3
        System.out.println(map.getCount(10)); // 0
    }
}
