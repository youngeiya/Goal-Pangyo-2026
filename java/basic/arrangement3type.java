import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        // [배열 방식 1]
        Thread[] array = { t1, t2, t3 };

        // [배열 방식 2]
        Thread[] array1 = new Thread[3];
        array1[0] = t1; array1[1] = t2; array1[2] = t3;

        // [배열 방식 3]
        Thread[] array2 = new Thread[]{ t1, t2, t3 };

        // enumerate 호출 (현재 살아있는 쓰레드 개수를 n에 담고, array에 정보를 담음)
        int n = Thread.enumerate(array);
        System.out.println("현재 활동 중인 쓰레드 수: " + n);

        // [ArrayList 방식] - 메서드 추가
        ArrayList<Thread> array3 = new ArrayList<>(); 
        array3.add(t1);
        array3.add(t2);
        array3.add(t3);
    }
}
