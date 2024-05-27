import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(11, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println();
        task2(nums);
        List<String> text = new ArrayList<>(List.of("ivan", "stepan", "fedor", "ivan", "oleg"));
        System.out.println();
        task3(text);
        System.out.println();
        System.out.println();
        System.out.println();
        List<String> spisok = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task4(spisok);


    }

    private static void task4(List<String> spisok) {
        Set<String> s = new HashSet<>(spisok);
        for (String word : s) {
            System.out.println(word + "-->" + Collections.frequency(spisok, word));
        }
    }


    private static void task3(List<String> text) {
        Set<String> set = new HashSet<>(text);
        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }


}