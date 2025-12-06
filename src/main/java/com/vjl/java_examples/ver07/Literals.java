package com.vjl.java_examples.ver07;

public class Literals {

    public void defineAndParseBeforeJava7() {
        int binaryNumber = Integer.parseInt("1010", 2); // binary literal for 10
        System.out.println("Binary 1010 as decimal: " + binaryNumber);
        int million = 1000000; // no underscores
        System.out.println("One million without underscores: " + million);
    }

    public void defineAndParse() {
        int binaryNumber = 0b1010; // binary literal for 10
        System.out.println("Binary 0b1010 as decimal: " + binaryNumber);
        int million = 1_000_000; // underscore for readability
        System.out.println("One million with underscores: " + million);
        int ipv4NetworkMask = 0b11111111_11111111_11111111_00000000; // IPv4 mask 255.255.255.0
        System.out.println("IPv4 Network Mask: " + ipv4NetworkMask);
    }

    public static void main(String[] args) {
        Literals literals = new Literals();
        literals.defineAndParse();
        System.out.println("--- Before Java 7 ---");
        literals.defineAndParseBeforeJava7();
    }
}


