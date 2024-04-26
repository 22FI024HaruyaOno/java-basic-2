import java.util.Scanner;

public class XmasTreeKadai {

    static int N;
    static int W;
    static int L;
	public static void main(String[] args) {
        System.out.println("最大の葉の横幅,幹の横幅,幹の長さの順で記入してください");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("クリスマスツリーのトークンは: " + str);
        System.out.println("文字を分割すると・・・");
        String[] word = str.split(",");//splitメソッドの引数に、どこの文字で分割するか指定します。この場合は空白文字。
        for(String w:word) {
            System.out.println(w);
        }
        N = Integer.parseInt(word[0]);
        W = Integer.parseInt(word[1]);
        L = Integer.parseInt(word[2]);
        System.out.println("最大の葉の横幅"+N);
        System.out.println("幹の横幅"+W);
        System.out.println("幹の長さ"+L);
        System.out.println("クリスマスツリーを描画します");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i <= N-j; i++) {
                System.out.print("+");
            }

            for (int i = 0; i <= j*2; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= N-j; i++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }

        for (int j = 0; j < L; j++) {

            for (int i = 0; i < N; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 3; i ++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
	}
}