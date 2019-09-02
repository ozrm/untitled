package partthree;

public class test21 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add(3, 5, 10));
        System.out.println(add(3.0, 5, 10.0));
        System.out.println(add(3.0, 5));
        System.out.println(add(3, 5.0));

        System.out.println();
        System.out.println(1);
        System.out.println(3.0);
    }

    /* 求和的方法 */
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    //方法名相同，参数个数不同，构成重载
    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    //方法名相同，参数类型不同，构成重载
    private static double add(double n1, int n2) {
        return n1 + n2;
    }
    private static double add(double n1, int n2,double n3) {
        return n1 + n2+n3;
    }

    //方法名相同，参数顺序不同，构成重载
    public static double add(int n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
/*
    //编译错误：只有返回值不同，不构成方法重载
    public static double add(int n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }

    //编译错误：只有参数名称不同，不构成方法重载
    public static int add(int n2, int n1) {
        double sum = n1 + n2;
        return sum;
    }

 */
}
