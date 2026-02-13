interface A {
    void abc(); // public abstract void abc();
	// 인터페이스형
}

class B implements A {
    public void abc() {
        System.out.println(200);
    }
}
class Test{
    static void def( A o){ o.abc();}
}

class Main {
    public static void main(String[] args) {
        // 다형적변수 부모 앞 자식 뒤
        A o= new B(); 
        // def 메서드 불러오기
        Test.def(o);
        Test.def(new B()); // 객체전달 바로 넣어도 가능
    }
}
