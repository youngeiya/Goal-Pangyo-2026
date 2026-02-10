import java.util.Calendar;

class A {
}

class B {
    static A abc() {
        return new A();
    }

    A def() {
        return new A();
    }
}

class Main {
    public static void main(String[] args) {
        // abc메서드 호출하는 문서작성
        A a1 = B.abc();
        B o = new B();
        A a2 = o.def();
        // java.util.Calendar 클래스의 getInstance메서드 호출 문장 작성
        System.out.println(Calendar.getInstance());
    }
}
