class A {
    static void a() throws Exception {
        Exception e = new Exception("폭탄메세지");
        throw e;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            A.a();
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    }
}
