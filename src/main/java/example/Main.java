package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//
//        Citrus citrus = new Citrus();
//
//        Orange orange = new Orange();

        List<Citrus> citrusList = new ArrayList<>();

//        citrusList.add(citrus);
//        citrusList.add(orange);

        List<Orange> orangeList = new ArrayList<>();

//        citrusList = orangeList;

//        orangeList.add(new Orange(5));
//        orangeList.add(new Orange(7));
//        orangeList.add(new Orange(3));

//        System.out.println(totalWeight(orangeList));

//        orangeList.add(new BigRoundOrange(10));
//        orangeList.add(new BigRoundOrange(9));

//        System.out.println(totalWeight(orangeList));

        addOrange(citrusList);

        System.out.println(citrusList.size());

    }

    public static int totalWeight(List<? extends Orange> oranges){
        int result = 0;
        Orange orangeGet = oranges.get(4);
        System.out.println(orangeGet.getClass().getSimpleName());
        for (Orange orange : oranges)
            result += orange.getWeight();

        return result;
    }

    public static void addOrange(List<? super Orange> oranges){
        oranges.add(new Orange(1));
        oranges.add(new Orange(2));
        oranges.add(new Orange(3));
        oranges.add(new Orange(4));
        oranges.add(new Orange(5));
        oranges.add(new Orange(6));
        oranges.add(new Orange(7));
        oranges.add(new Orange(8));
        oranges.add(new Orange(9));
        oranges.add(new Orange(10));

        oranges.add(new BigRoundOrange(10));
    }

    static class Fruit {
        private int weight;

        public int getWeight() {
            return weight;
        }

        public Fruit(int weight){
            this.weight = weight;
        }
    }

    static class Citrus extends Fruit{

        public Citrus(int weight) {
            super(weight);
        }
    }

    static class Orange extends Citrus{
        private String color;

        public Orange(int weight){
            super(weight);
        }
    }

    static class BigRoundOrange extends Orange{
        private int size = 100;

        public BigRoundOrange(int weight) {
            super(weight);
        }
    }
}
