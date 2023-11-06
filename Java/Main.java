public class Main {
    public static void main(String[] args) {
        // 1問目: 1から10までの偶数を昇順で表示
        System.out.println("\n[1問目]1から10までの偶数を昇順で表示");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("\n[2問目]1から10までの偶数の個数と合計を表示");
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("偶数の個数:" + count);
        System.out.println("合計" + sum);
    }
}
