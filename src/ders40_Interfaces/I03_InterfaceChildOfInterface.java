package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface {

/*
Bir Interface i baska bir Interface in
Child i yapmak istersek yine classs larda moldugu guibi
extends kullnilir

Interface i Class in child i yapacaksak implements ifadesi
kulanilir extends kullanilmaz
 */

    @Override
    void method1();
//Interface bir child Parent Interfacedeki abstract
// metzhodu override edebilir ama ikisinin de
    //body si olmadigi icin bir ise yaramaz


}
