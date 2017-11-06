import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        System.out.print("Input amount of Fibonacci numbers: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNumbers = Integer.parseInt(reader.readLine());

        directOrder(fibonacci(1, 1, numberOfNumbers));
        reverseOrder(fibonacci(1, 1, numberOfNumbers));
    }

    public static ArrayList<Integer> fibonacci(int a, int b, int numberOfNumbers) throws Exception {
        int sum;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            arrayList.add(a);
            sum = a + b;
            a = b;
            b = sum;
        }
        return arrayList;
    }

    public static void directOrder(ArrayList<Integer> arrayList) {
        System.out.println("Direct order: " + arrayList);
    }

    public static ArrayList<Integer> reverseOrder(ArrayList<Integer> arrayList) throws Exception {
        Collections.reverse(arrayList);
        System.out.println("Reversed order: " + arrayList);
        return arrayList;
    }
}
