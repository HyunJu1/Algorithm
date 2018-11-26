package fourth;

import java.util.Scanner;

public class 동전1_2293 {

    // cnt[i] : n가지 종류의 동전을 써서 i원을 만드는 경우의 수
    static int[] cnt = new int[10001];

    public static void main(String[] args) {

        int n; // 동전 종류 개수
        int tot; // 목표
        int[] coins;

        Scanner sc = new Scanner(System.in);
        
        n= sc.nextInt();
        tot=sc.nextInt();


        coins = new int[n];
        for (int i = 0; i < n; i++) {

            coins[i] = sc.nextInt();
        }
        
        cnt[0] = 1;

        for (int i = 0; i < n; i++) {

            for (int j = coins[i]; j <= tot; j++) {

                cnt[j] += cnt[j - coins[i]];
            }
        }

        System.out.println(cnt[tot]);
    }
}

