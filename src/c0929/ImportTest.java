package c0929;

import c0929.sample.imported;
import c0929.StaticInnerClass.Class2.Class2Class1;

public class ImportTest {
       static public void main(String[] arg) {
           System.out.println(c0929.sample.imported.getText());
           System.out.println(imported.getText());
           StaticInnerClass.Class2 c = new StaticInnerClass.Class2();
           Class2Class1 c2 = new Class2Class1();
       }
    }
