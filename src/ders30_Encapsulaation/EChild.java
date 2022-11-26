package ders30_Encapsulaation;

public class EChild extends DParent{
  public static void main(String[] args) {

    EChild child1=new EChild();
    child1.isim="efe";
    child1.yas=32;
    child1.isEnough=true;
StringBuilder sb=new StringBuilder("java");
sb.append("efe",1,2);
    System.out.println(sb);



  }

  }
