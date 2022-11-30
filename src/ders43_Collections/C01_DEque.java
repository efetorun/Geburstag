package ders43_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_DEque {
    public static void main(String[] args) {


        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");
        dq1.addLast("B");
        dq1.addFirst("A");//
        System.out.println(dq1);
        System.out.println(dq1.getFirst());//A
        System.out.println(dq1.getLast());//B
        System.out.println(dq1); //[A, K, B, B]
        System.out.println(dq1);
    }





}
