package multiex;

public class Swallow implements Bird{
    public void fly(){
        System.out.println ("燕子会飞");
    }

    @Override
    public void sing() {
        System.out.println ("燕子会唱歌");
    }
}
