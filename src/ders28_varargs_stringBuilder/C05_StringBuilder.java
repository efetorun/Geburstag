package ders28_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java Candir ");
        System.out.println(sb.capacity());//27
        System.out.println(sb.length());//11

        System.out.println(sb.reverse());//ridnaC avaJ tersine cevirme
        sb.reverse();
        sb.replace(1,3,"am");//av yerine am koydu
        System.out.println(sb);
        System.out.println(sb);//Jama Candir
        sb.insert(12,"cana can katar");//yazi ekler//Jama Candir cana can katar
        System.out.println(sb);

        String str="Java cok güzel";

        sb.insert(15,9);
        System.out.println(sb.indexOf("m"));//2 m nin index ini bulduk

    }




}
