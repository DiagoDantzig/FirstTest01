public class MammalInt {
    public void eat(){
        System.out.println ("Mannal eats");
    }
    public void travel(){
        System.out.println ("Mammal travels");
    }
    public int noOflegs(){
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m=new MammalInt ();
        m.eat ();
        m.travel ();
    }
}
