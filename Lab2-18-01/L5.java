import java.util.Scanner;
import java.util.HashMap;

// public class L5 {
//     public static void main(String args[]) {
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter Ten Numbers: ");
//         int arr[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             arr[i] = scanner.nextInt();
//             if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }
//         for (int i = 0; i < map.size(); i++) {
//             System.out.printf("Number %d occured %d times\n", arr[i], map.get(arr[i]));
//         }
//     }
// }

public class L5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ten Numbers: ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i]==arr1[j]) {
                    arr2[j]++;
                    check = true;
                }
            }
            if (check==false) {
                arr1[i] = arr[i];
                arr2[i] = 1;
            }
        }
        System.out.println("Frequencies are:");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=0) {
                System.out.printf("%d occurred %d times.\n", arr1[i], arr2[i]);
            }
        }
    }
}