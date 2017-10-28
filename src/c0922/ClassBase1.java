package c0922;

import java.lang.reflect.Constructor;

public class ClassBase1 {
    static public void main(String[] arg){
        Constructor c = new Constructor();
        System.out.println(c.getName());
        System.out.println(c.getFriend(0));
        Constructor c1 = new Constructor("kiwan");
        System.out.println(c1.getName());
        System.out.println(c1.getFriend(0));
        Constructor c2 = new Constructor("kiwan", "maeng");
        System.out.println(c2.getName());
        System.out.println(c2.getFriend(0));

        NoConst no = new NoConst();
        System.out.println(no.getFirsrName(c2));

        System.out.println(Constructor.plus(3,5));
        System.out.println(c2.plus(5,5));
    }
}
