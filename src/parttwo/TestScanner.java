package parttwo;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入名字");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
