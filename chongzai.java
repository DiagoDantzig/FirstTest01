class MyClass{
    void info(){
        System.out.println ("原函数");
    }
    void info(String s){
        System.out.println (s);
    }
    void info(int...num){
        for (int x:num){
            if(x == 30){
                break;
            }
            System.out.println (x);
        }
    }
}
public class chongzai {
    public static void main(String[] args) {
        MyClass t=new MyClass ();
        t.info ();
        t.info ("重载函数");
        t.info (10,20,30,40,50);
    }
}
