package sudhir.amazon.ds.assesment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MaxWeight {
    public static void main(String[] args) {
        List<Integer> weightList = Arrays.asList(2, 9, 10,1, 3, 7);
        System.out.println(getAmazonHeaviestPackage(weightList));
        System.out.println(getAmazonHeaviestPackage2(weightList));
    }

    private static long getAmazonHeaviestPackage(List<Integer> list) {
        System.out.println("Max: "+list.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("Max: "+list.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Max: "+list.stream().reduce(Integer::max).get());
        System.out.println("Max: "+list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get());
        System.out.println("Max: "+list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax());

        long currentWeight = list.get(list.size()-1);
        long prevWeight = currentWeight;
        HashSet<Integer> indexes = new HashSet<>();
        for (int i = list.size()-1; i > 0; i--) {
            //if (!indexes.contains(i)){
                if(list.get(i) > list.get(i-1)){

                    currentWeight += list.get(i-1);
                    // indexes.add(i-1);
                    if(i-1 == 0) break;
                }else{
                    prevWeight = currentWeight;
                    currentWeight = list.get(i-1);
                }
            //}
        }
        return currentWeight > prevWeight ? currentWeight : prevWeight;
    }

    private static long getAmazonHeaviestPackage2(List<Integer> list) {
        Integer[] array = list.stream().toArray(Integer[]::new);
        long currentWeight = array[array.length-1];
        long max = currentWeight;
        for (int i = array.length-2; i >= 0; i--) {
            if(currentWeight > array[i]){
                currentWeight = currentWeight + array[i];
            }else
                currentWeight = array[i];
            max = Math.max(currentWeight, max);
        }
        return max;
    }
}

