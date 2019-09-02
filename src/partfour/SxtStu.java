package partfour;

public class SxtStu {
    int id;
    String name;
    int age;
    Computer computer;

    void study() {
        System.out.println("学习"+computer.brand);
    }

    SxtStu() {
    }
    public static void main(String[] args){
        SxtStu stu1 = new SxtStu();
        stu1.name = "张三";
        Computer computer1 = new Computer();
        computer1.brand = "联想";
        stu1.computer = computer1;
        stu1.study();
    }
}

class Computer {
    String brand;
}
