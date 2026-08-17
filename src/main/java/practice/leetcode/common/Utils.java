package practice.leetcode.common;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("-");

        StringBuilder path = new StringBuilder();
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            String part = split[i];
            path.append(part);
            String capitalized = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            camelCase.append(capitalized);
        }

        System.out.println(path);
        System.out.println(camelCase);

        sc.close();
    }
}
