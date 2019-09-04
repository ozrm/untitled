package partfive.test;

import java.util.stream.StreamSupport;

public class testToString {
    public static void main(String[] args){
        Person person=new Person();
        person.age=12;
        person.name="战士";
        System.out.println("info:"+person);

        testToString testToString = new testToString();
        System.out.println(testToString);
    }
}
class Person{
    String name;
    int age;
    public String ttoString(){
        return name+",年龄:"+age;
    }
   /* @Override
    public String toString(){
        return name+",年龄:"+age;
    }

    */
}
