package drs42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {
        Queue<String> q1=new LinkedList<>();

        q1.add("H");
        q1.add("Y");

        q1.offer("K");

//kapasitesi sinirlamasi yapmadiginiz sürece add() ile ayni islemi yapar
        System.out.println(q1);//[H, Y, K]

        q1.remove();
        System.out.println(q1);//H yi yani bastaki elkemani remove etti [Y, K]

       q1.remove("Y");//Y yi sildi
        System.out.println(q1);//[K]




    }








}
