import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calc2ScannerFile {
	static Scanner scan;
	public static void main(String args[]){
		try{
			File file = new File("targetfile.txt");
			scan = new Scanner(file);
			scan.useDelimiter("¥¥r¥¥n");
			int line = 1;
            int[] numbers = new int[2];
			while(line <= 2){
				String str = scan.nextLine();
				System.out.println(line + ":" + str);
                numbers[line-1] = Integer.parseInt(str);
				line++;
			}
            System.out.println("計算結果:" + (numbers[0] + numbers[1]));
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}

//  課題    ファイルから読み込むキーボードから2つの数字を打ち込む
//     その足し算結果を、出力する。
