package sudhir.airtel;

import java.util.HashSet;
import java.util.Random;

public class CustomHashSet<E> extends HashSet {
    public Object getRandom(){
        return this.stream().findAny().get();
    }
}
class Sudhir{
    public static void main(String[] args) {
        CustomHashSet<Integer> integerCustomHashSet = new CustomHashSet<>();
        integerCustomHashSet.add(10);
        integerCustomHashSet.add(20);
        integerCustomHashSet.add(30);
        integerCustomHashSet.add(40);
        integerCustomHashSet.add(40);

        for (int i = 0; i < 100; i++) {
            integerCustomHashSet.add(new Random().nextInt(111));
        }

        System.out.println("Size: "+integerCustomHashSet.size());
        System.out.println(integerCustomHashSet.getRandom());
    }
}