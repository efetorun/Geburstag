package ders38_AbstractClasses;

public class EChildofAbstractClasses extends CParentAbstractClasses{
    @Override
    public void mecburiMethod1() {
        System.out.println("efe");
    }

    @Override
    public void mecburiMethod2() {
        System.out.println("Torun");
    }

    public static void main(String[] args) {
        EChildofAbstractClasses obj = new EChildofAbstractClasses();
         obj.mecburiMethod1();

    }

}
