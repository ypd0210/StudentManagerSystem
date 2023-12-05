package com.study;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int s =0;
        int a = 1;
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        do {
            s = 1;
            a = a - 2;
        }while (i == 0);

        System.out.println(s);
    }
}
