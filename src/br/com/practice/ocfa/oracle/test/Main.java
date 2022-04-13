package br.com.practice.ocfa.oracle.test;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = b * a * (a++ - --b) * a * b;
        System.out.println("\nC = "+c);

        String s = "a" + (5+5);
        System.out.println("String s = "+s);

        int m = 50;
        int n = ++m;
        int o = m--;
        int p = --o+m--;
        System.out.println("M = "+m);
        System.out.println("N = "+n);
        System.out.println("O = "+o);
        System.out.println("P = "+p);
    }
}
