import java.util.Scanner;

public class Calc2Scanner {
    static Scanner scan;
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
            try {
                scan = new Scanner(System.in);
                String str = scan.next();
                System.out.println("最初のトークンは: " + str);
                int a = Integer.parseInt(str);
                str = scan.next();
                System.out.println("次のトークンは  : " + str);
                int b = Integer.parseInt(str);
                System.out.println(a + b);
                i++;
            }
            catch(NumberFormatException e) {
                System.out.println(e);
            }
		}
	}
}

//  課題    キーボードから2つの数字を打ち込む
//     その足し算結果を、出力する。