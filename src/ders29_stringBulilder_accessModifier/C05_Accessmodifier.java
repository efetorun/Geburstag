package ders29_stringBulilder_accessModifier;

public class C05_Accessmodifier {


    public static void main(String[] args) {
    C04_AccessModifier obj=new C04_AccessModifier();
    C04_AccessModifier obj2=new C04_AccessModifier();
        System.out.println(obj.isim);//Ali
        obj.isim="Efe";
        System.out.println(obj.isim);//Efe atama yaptiktan sonra Efe oldu
        

    }
}
