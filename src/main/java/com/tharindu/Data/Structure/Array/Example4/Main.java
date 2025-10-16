package com.tharindu.Data.Structure.Array.Example4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Array ar = new Array(10);
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        System.out.println(ar);

        ar.remove(20);
        System.out.println(ar);
    }
}