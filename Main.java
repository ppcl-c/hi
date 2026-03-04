import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int hp = 20;
        System.out.println("你好");
        System.out.println("这是猜数字2版");
        while(true){
            System.out.println("开始(0-99以内)");
            int num = rand.nextInt(100);
            System.out.println(num);
            int a = sc.nextInt();
            if (a == num) {
                System.out.println("你赢了");
                System.out.println("你的机会还剩" + hp);
                System.out.println("输入101退出");
            } else if (a == 101) {
                System.out.println("正在退出");
                sc.close();
                break;


            } else  {
                System.out.println("你输了");
                hp -= 1;
                System.out.println("你的机会还剩" + hp);

            }
            if (hp <= 0) {
                System.out.println("=====游戏失败=====");
                sc.close();
                break;
            } else if (hp < 3) {
                System.out.println("!!! 你的机会只剩" + hp);



            }

        }

    }

}


