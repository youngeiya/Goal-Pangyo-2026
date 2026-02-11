class A {
    A(String v) { System.out.println(100); }
}

class B extends A {
    B(String v) {
        super(v);
        System.out.println(200);
    }
    B(int v) {
        this("aa");
        System.out.println(300);
    }
}

public class Main {
    public static void main(String[] args) {
        B o = new B(400); 
    }
}
