package ders28_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        //bu kod yazilinya java 7 karakter aslacak bir String builder olusturur
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//0

        sb.append("java");
        System.out.println(sb);//java
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//4

        sb.append("güzeldir");
        System.out.println(sb.capacity());//16
        sb.append(" ona ne süphe");
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//25

        // kapasite ve length i esitlemek isterseniz

        sb.trimToSize();
        System.out.println(sb.capacity());//25
        System.out.println(sb.length());//25
    }

}
