package partthree;

public class Test20 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = add(num1, num2);
        System.out.println("sum=" + sum);
        print();
    }

    private static int add(int n1, int n2) {
        return n1 + n2;
    }

    private static void print() {
        System.out.println("你好");
    }
}
