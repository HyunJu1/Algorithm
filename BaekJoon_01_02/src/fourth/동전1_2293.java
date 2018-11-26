package fourth;

import java.util.Scanner;

public class ����1_2293 {

    // cnt[i] : n���� ������ ������ �Ἥ i���� ����� ����� ��
    static int[] cnt = new int[10001];

    public static void main(String[] args) {

        int n; // ���� ���� ����
        int tot; // ��ǥ
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

