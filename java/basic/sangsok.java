class A {
    int a = 100;

    void b() {
        System.out.println(200);
    }
}

class B extends A {
    // 자식 extends 부모
    int c = 300;

    void d() {
        System.out.println(400);
    }
}

class Main {
    public static void main(String[] args) {
        B o = new B();
        System.out.println(o.a);

        o.b();
        System.out.println(o.c);
        o.d();
    }
}
