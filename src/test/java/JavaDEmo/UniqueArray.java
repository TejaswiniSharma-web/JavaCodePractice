package JavaDEmo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueArray {
    public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 3, 5, 1, 6};
            int[] uniqueElements = findUniqueElements(array);

            System.out.println("Unique elements: " + Arrays.toString(uniqueElements));
        }

        public static int[] findUniqueElements(int[] array) {
            HashSet<Integer> seen = new HashSet<>();
            ArrayList<Integer> unique = new ArrayList<>();

            for (int num : array) {
                if (!seen.contains(num)) {
                    unique.add(num);
                    seen.add(num);
                }
            }

            // Convert the ArrayList to an array
            int[] uniqueArray = new int[unique.size()];
            for (int i = 0; i < unique.size(); i++) {
                uniqueArray[i] = unique.get(i);
            }

            return uniqueArray;
        }
    }



