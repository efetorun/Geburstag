package ders40_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class I09_ChildOfI08 implements I08_InterfaceStaticUndDefaultMethods {
    /*
    Java 8 iole developerlarin talebi üzerine yenio bir
    istisnai durum java ya eklenmistir

    bir interface i yilllar icerisinde yuzlerce class inherit etmis olabilir
    sonradan eklenen bir abstract methos tüm eski childler tarafindfan
    inheherit edilmelidir aksi takdirde tüm eski child classlar cet verecektir

    Java 8 ile birlikte Java interfacelere default ve static ile isaretlenmek
    sarti ile bodysi olan method eklenmesine izin verilmisstir

     */


    @Override
    public void method() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method31() {

    }

    @Override
    public void method3() {
        I08_InterfaceStaticUndDefaultMethods.super.method3();
    }


    public void method4() {

    }

    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();


    }
}
