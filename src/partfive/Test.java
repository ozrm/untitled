package partfive;

import java.net.PasswordAuthentication;
import java.security.PublicKey;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("罗惠琪", 175, "交通工程");
        student.rest();
        student.study();
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会儿");
    }
}

class Student extends Person {
    String major;

    public void study() {
        System.out.println("在家学习Java");
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }
}


