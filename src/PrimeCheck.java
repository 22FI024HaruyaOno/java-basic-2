import java.util.ArrayList;

public class PrimeCheck {
    public static void main(String[] args) {
        int N = 100000;
        ArrayList<Integer> GroupA_1 = new ArrayList<>();
        ArrayList<Integer> GroupB_3 = new ArrayList<>();
        ArrayList<Integer> GroupC_5 = new ArrayList<>();
        ArrayList<Integer> GroupD_7 = new ArrayList<>();
        ArrayList<Integer> GroupE_9 = new ArrayList<>();
        int[][] primeRemainderRanking = new int[4][4];
        for(int i = 0; i < primeRemainderRanking.length; i ++) {
            for(int j = 0; j < primeRemainderRanking[i].length; j ++) {
                primeRemainderRanking[i][j] = 0;
            }
        }
        int i = 2;
        int prev = 0;
        int now = 0;;
        while (i <= N) {
            if (i == 3) {
                prev = i % 10;
            }
            else if(i >= 4){
                int j = 2;
                while (j <= i) {
                    if (j == i) {
                        now = i % 10;
                        if(now == 1) {
                            GroupA_1.add(i);
                        }
                        else if(now == 3) {
                            GroupB_3.add(i);
                        }
                        else if(now == 5) {
                            GroupC_5.add(i);
                        }
                        else if(now == 7) {
                            GroupD_7.add(i);
                        }
                        else if(now == 9) {
                            GroupE_9.add(i);
                        }
                        if(now != 5) {
                            if(prev == 1 && now == 1) {
                                primeRemainderRanking[0][0] ++;
                            }
                            else if(prev == 1 && now == 3) {
                                primeRemainderRanking[0][1] ++;
                            }
                            else if(prev == 1 && now == 7) {
                                primeRemainderRanking[0][2] ++;
                            }
                            else if(prev == 1 && now == 9) {
                                primeRemainderRanking[0][3] ++;
                            }
                            else if(prev == 3 && now == 1) {
                                primeRemainderRanking[1][0] ++;
                            }
                            else if(prev == 3 && now == 3) {
                                primeRemainderRanking[1][1] ++;
                            }
                            else if(prev == 3 && now == 7) {
                                primeRemainderRanking[1][2] ++;
                            }
                            else if(prev == 3 && now == 9) {
                                primeRemainderRanking[1][3] ++;
                            }
                            else if(prev == 7 && now == 1) {
                                primeRemainderRanking[2][0] ++;
                            }
                            else if(prev == 7 && now == 3) {
                                primeRemainderRanking[2][1] ++;
                            }
                            else if(prev == 7 && now == 7) {
                                primeRemainderRanking[2][2] ++;
                            }
                            else if(prev == 7 && now == 9) {
                                primeRemainderRanking[2][3] ++;
                            }
                            else if(prev == 9 && now == 1) {
                                primeRemainderRanking[3][0] ++;
                            }
                            else if(prev == 9 && now == 3) {
                                primeRemainderRanking[3][1] ++;
                            }
                            else if(prev == 9 && now == 7) {
                                primeRemainderRanking[3][2] ++;
                            }
                            else if(prev == 9 && now == 9) {
                                primeRemainderRanking[3][3] ++;
                            }
                            prev = now;
                        }
                        break;
                    }
                    else if (i % j == 0) {
                        break;
                    }
                    else {
                        j ++;
                    }
                }
            }
            i ++;
        }
        System.out.println("グループごとの個数");
        System.out.println("下1桁 = 1 : " + GroupA_1.size());
        System.out.println("下1桁 = 3 : " + GroupB_3.size());
        System.out.println("下1桁 = 5 : " + GroupC_5.size());
        System.out.println("下1桁 = 7 : " + GroupD_7.size());
        System.out.println("下1桁 = 9 : " + GroupE_9.size());
        System.out.println();
        System.out.println("Ranking");
        for(int k = 0; k < primeRemainderRanking.length; k ++) {
            for(int l = 0; l < primeRemainderRanking[k].length; l ++) {
                switch (k) {
                    case 0:
                        System.out.print("1-");
                        break;
                    case 1:
                        System.out.print("3-");
                        break;
                    case 2:
                        System.out.print("7-");
                        break;
                    case 3:
                        System.out.print("9-");
                        break;
                    default:
                        break;
                }
                switch (l) {
                    case 0:
                        System.out.print("1:");
                        break;
                    case 1:
                        System.out.print("3:");
                        break;
                    case 2:
                        System.out.print("7:");
                        break;
                    case 3:
                        System.out.print("9:");
                        break;
                    default:
                        break;
                }
                System.out.print(primeRemainderRanking[k][l] + " ");
            }
            System.out.println();
        }
    }

}
