package c0922;

import c0915.*;

public class ClassBase0 {
    static public void main(String[] arg){
        Calculator c = new Calculator();
        Parent parent = new Child();

        System.out.println( parent.action());

        parent.mutator("abd");
        System.out.println(parent.getName());
        parent.mutator("123");
        System.out.println(parent.getName());
        System.out.println(parent.getName());
        System.out.println(parent.getName());

        String a = "abcd";
        System.out.println(a.length());
        a = null;

    }
}
