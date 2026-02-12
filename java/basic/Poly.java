class Component {
    String type;

    Component(String type) {
        this.type = type;
    }

    void printInfo() {
        System.out.println(type);
    }
}

class Button extends Component {
    Button(String s) {
        super(s);
    }
}

class Checkbox extends Component {
    Checkbox(String s) {
        super(s);
    }
}

class Choice extends Component {
    Choice(String s) {
        super(s);
    }
}

class Frame {
    static void add(Component component) {
        component.printInfo();
    }
}

class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        Checkbox checkbox = new Checkbox("체크박스");
        Choice choice = new Choice("드랍다운메뉴");
        Frame.add(button);
        Frame.add(checkbox);
        Frame.add(choice);
    }
}
