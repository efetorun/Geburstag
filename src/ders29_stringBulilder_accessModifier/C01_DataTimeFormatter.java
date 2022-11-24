package ders29_stringBulilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DataTimeFormatter {
public static void main(String[]args){
LocalDateTime zaman=LocalDateTime.now();
    System.out.println(LocalDateTime.now());//2022-11-24T07:03:46.467167600

    DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
    System.out.println(zaman.format(dtf1));//24/11/2022
    DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");
    System.out.println(zaman.format(dtf2));//24:Kas:22
    DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d.MMMM.YYYY.EEEE.HH.mm a");
    System.out.println(zaman.format(dtf3));//24.Kasım.2022.Perşembe.07.43 ÖÖ

}



        }
