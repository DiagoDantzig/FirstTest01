class Person{
    public static void  prt(String s){
        System.out.println (s);
    }
    Person(){
        System.out.println ("父类.无参数构造方法：");
    }
    Person(String name){
        System.out.println ("父类有参构造方法="+name);
    }
}
class Chinese extends Person{
    Chinese(){
        super();
        System.out.println ("子类调用父类无参构造方法");
    }
    Chinese(String name){
        super(name);
        System.out.println ("子类调用父类的构造方法="+name);
    }
    Chinese(String name,int age){
        this(name);
        System.out.println ("子类调用自己="+age);
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Chinese cn=new Chinese ();
        cn=new Chinese ("codersai");
        cn=new Chinese ("codersai",18);
    }
}
