class School {
}

class Teacher extends School {

    void shouting() {
        System.out.println("똑바로앉아!");
    }

}

class Main {

    public static void main(String[] args) {

        School school = new Teacher();

        Teacher teacher = (Teacher) school;

        teacher.shouting();

    }

}
