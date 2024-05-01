import java.util.ArrayList;

public class PrimeCheck {
    public static void main(String[] args) {
        int N = 100;
        ArrayList<Integer> primeNumberList = new ArrayList<>();
        int i = 3;
        while (i <= N) {
            if (i > 1 && i <= 3) {
                primeNumberList.add(i);
            }
            else {
                int j = 3;
                while (j <= i) {
                    if (j == i) {
                        primeNumberList.add(i);
                        break;
                    }
                    else if (i % j == 0) {
                        break;
                    }
                    else {
                        j += 1;
                    }
                }
                i += 1;
            }
        }
        System.out.print("[ ");
        for(int primeNumber : primeNumberList) {
            
            System.out.print(primeNumber + " ");
        }
        System.out.print("]");
        //print(str(N) + "までの素数の数:"+str(len(primeNumberList)))
    }

}
