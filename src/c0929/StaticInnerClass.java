package c0929;

import c0929.sample.imported;

public class StaticInnerClass {
    private static class Class1{
        static class Class1Class1{}
        Class1(){
            System.out.println(imported.getText());
        }
    }
    static class Class2{
        static class CLass2Class1{}
    }
    static public void main(String[] arg){
        c0929.StaticInnerClass.Class1.Class1Class1 c = new StaticInnerClass.Class1.Class1Class1();
        System.out.println(imported.getText());
    }
}
