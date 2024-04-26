import java.util.Random;

public class HeikinCKadai {
    static final int studentNum = 100;
    public static void main(String[] args){
        // math
        Kamoku[] mathResult = new Kamoku[studentNum];
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < mathResult.length; i ++) {
            mathResult[i] = new Kamoku(random.nextInt(101), i+1);
            sum += mathResult[i].getScore();
        }
        int ave = sum/studentNum;
        System.out.println("100人の平均点は" + ave + "です");
        System.out.println("以下合格者の点数です。");
        for(int i = 0; i < mathResult.length; i ++) {
            if(mathResult[i].getScore() >= 80) {
                System.out.println("学籍番号:" + mathResult[i].getStudentId() + " 点数:" + mathResult[i].getScore());
                System.out.println();
            }
        }
    }
}
