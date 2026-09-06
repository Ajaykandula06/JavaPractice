package RandomPractice;
import java.util.HashMap;
import java.util.ArrayList;

public class Duplicates {
    public int[] duplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i])==2 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        int[] duplicates = list.stream().mapToInt(Integer::intValue).toArray();
        return duplicates;
    }

    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr) {
        System.out.print("input ");
        printArray(arr);
        Duplicates obj = new Duplicates();
        int result[] = obj.duplicate(arr);
        System.out.print("Output ");
        printArray(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] arr2 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr3 = {1, 1, 2, 3, 3, 4};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
    }
}
