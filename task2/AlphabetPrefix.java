package task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlphabetPrefix {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/task2/data_prog_contest_problem_2.txt")));
        int n = Integer.parseInt(bufferedReader.readLine());
//        int n = scanner.nextInt();

        int[] sequence = new int[n];
        String[] strings = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(strings[i]);
        }

        String result = findMinAlphabetPrefix(sequence);

        System.out.println(result);
    }

    public static String findMinAlphabetPrefix(int[] sequence) {
        Set<Integer> foundLetters = new HashSet<>();
        int alphabetSize = 26;

        for (int i = 0; i < sequence.length; i++) {
            int num = sequence[i];
            foundLetters.add(num);


            if (foundLetters.size() == alphabetSize) {
                return String.valueOf(i + 1);
            }

        }

        return "NONE";
    }
}
