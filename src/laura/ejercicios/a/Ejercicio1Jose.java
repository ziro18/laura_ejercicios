package laura.ejercicios.a;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1Jose {

    public static void main(String[] args) {
        int [] array = { 1, 3, 4, 5, 6, 1, 3};
//        int [] array = {};

        logger("Delete Duplicates 1");
        showCollection(Arrays.stream(deleteDuplicates(array)).boxed().collect(Collectors.toList()));
        logger("Delete Duplicates 2");
        showCollection(Arrays.stream(deleteDuplicates2(array)).boxed().collect(Collectors.toList()));
        logger("Delete Duplicates 3");
        showCollection(Arrays.stream(deleteDuplicates3(array)).boxed().collect(Collectors.toList()));
        logger("Delete Duplicates 4");
        showCollection(Arrays.stream(deleteDuplicates4(array)).boxed().collect(Collectors.toList()));
    }

    private static int[] deleteDuplicates(int[] array) {
        return Arrays.stream(array).distinct().boxed().mapToInt(Integer::intValue).toArray();
    }

    private static int[] deleteDuplicates2(int[] array) {
        HashSet<Integer> set = new HashSet<>(Arrays.stream(array).boxed().collect(Collectors.toList()));

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] deleteDuplicates3(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        int[] result = new int[set.size()];
        int count = 0;

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();

            result[count] = next;
            count++;
        }

        return result;
    }

    private static int[] deleteDuplicates4(int[] array) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(!integers.contains(array[i])) {
                integers.add(array[i]);
            }
        }

        return integers.stream().mapToInt(Integer::intValue).toArray();
    }
    private static void showCollection(Collection colection) {
        colection.forEach(System.out::println);
    }

    private static void logger(Object obj) {
        System.out.println("");
        System.out.println(obj);
        System.out.println("");
    }
}
