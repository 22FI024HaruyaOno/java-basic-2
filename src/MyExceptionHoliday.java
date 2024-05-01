import java.util.Scanner;

public class MyExceptionHoliday {
    static Scanner scan;
    public static void main(String[] args) {
        MyExceptionHoliday mEholiday = new MyExceptionHoliday();
        scan = new Scanner(System.in);
        System.out.println("日付を入力してください");
        while (scan.hasNext()) {
            try {
                int day = Integer.parseInt(scan.next());
                if(day >= 32) {
                    System.out.println("32日以降はありません");
                }
                else if(day < 1){
                    System.out.println("1以上の整数値を入れてください");
                }
                else {
                    mEholiday.CheckHoliday(day);
                }
            }
            catch (NumberFormatException e) {
                System.out.println(e);
            }
            catch (NoHolidayException e) {
                e.printStackTrace();
            }
        }
    }
    void CheckHoliday(int day) throws NoHolidayException{
        if (day != 3 && day != 4 && day != 5 && day != 6) {
            if(day != 12 && day != 19 && day != 26) {
                if(day != 11 && day != 18 && day != 25) {
                    throw new NoHolidayException();
                }
            }
        }
    }
}
