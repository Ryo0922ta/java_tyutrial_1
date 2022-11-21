import java.util.Scanner;

public class alugorism_1 {
    public static void main(String[] args) {
        int[] coin_list = { 10, 50, 100 };
        String[] drinks = { "牛乳", "コーラ", "オレンジ" };
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println(drinks[i]);
        }
        System.out.println("各60円です");
        do {
            System.out.println("10円[0],50円[1],100円[2],何もしない[3以上のどれか]硬貨を選んでください");
            num1 = scan.nextInt();
            if (num1 >= 3) {
                System.out.println("硬貨は選択されていません");
                System.out.println("現在０円です");
            } else {
                System.out.println("現在" + coin_list[num1] + "円です");
                sum += coin_list[num1];
            }
            System.out.println("合計" + sum + "円です");
        } while (sum < 60);

        System.out.println("商品を選んでください");
        System.out.println("牛乳[0],コーラ[1],オレンジ[2],やっぱり買わない[3以上のどれか]");
        num2 = scan.nextInt();

        if (num2 >= 3) {
            System.out.println("またのご利用お待ちしております。");
            System.out.println("おつりは" + sum + "円です");
        } else {
            System.out.println("ありがとうございます。" + drinks[num2] + "お渡しします");
            sum -= 60;
            System.out.println("おつりは" + sum + "円です");
        }

        scan.close();
        // 1度closeしてから再度new Scanner(System.in); してSystem.inを使おうとするとエラーになります。
        // よって繰り返し標準入力したい場合はclose()の位置は繰り返しが終了したタイミングで
    }
}