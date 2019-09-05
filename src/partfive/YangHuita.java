package partfive;

public class YangHuita {
    public static void main(String[] args) {
        int levelCount = 5;
        int[][] yanghui = new int[levelCount][0];
        for (int i = 0; i < levelCount; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    yanghui[i][j] = 1;
                } else {
                    int value = 0;
                    if (j >= 1) {
                        value += yanghui[i - 1][j - 1];
                    }
                    if (j < i) {
                        value += yanghui[i - 1][j];
                    }
                    yanghui[i][j] = value;
                }
            }
        }
        for (int i = 0; i < levelCount; i++) {
            for (int j = 0; j < levelCount - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(yanghui[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
