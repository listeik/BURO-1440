package task1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SegmentCovering {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/task1/data_prog_contest_problem_1.txt")));
        System.out.println("Количество отрезков: ");
//        int n = scanner.nextInt();
        int n = Integer.parseInt(bufferedReader.readLine());

        int[][] segments = new int[n][2];
        System.out.println("Отрезки: ");
        for (int i = 0; i < n; i++) {
            String[] strings= bufferedReader.readLine().split("\t");
            segments[i][0] = Integer.parseInt(strings[0]);
            segments[i][1] = Integer.parseInt(strings[1]);
        }

        Arrays.sort(segments, Comparator.comparingInt(a -> a[1]));

        int points = 0;
        int lastPoint = -1;

        for (int[] segment : segments) {
            if (lastPoint < segment[0]) {
                points++;
                lastPoint = segment[1];
            }
        }

        System.out.println("Результат: " + points);
    }
}