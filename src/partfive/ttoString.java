package partfive.test;

public class ttoString {
    public static void main(String[] args){
        Person person=new Person();
        person.age=12;
        person.name="战士";
        System.out.println("info:"+person);

        ttoString t=new ttoString();
        System.out.println(t);
    }
}
class Person{
    String name;
    int age;
    public String mtoString(){
        return name+",年龄:"+age;
    }
    /*@Override
    public String toString(){
        return name+",年龄:"+age;
    }

     */
}
