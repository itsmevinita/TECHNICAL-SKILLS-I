
// Q2.find the sum of prefixsum array
import java.util.Scanner;

public class prefixarray {
    public static void main(String agrs[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = a.nextInt();
        int b[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            b[i] = a.nextInt();
        }
        int pf[] = new int[n];
        pf[0] = b[0];
        for (int i = 1; i < n; i++) {
            pf[i] = b[i] + pf[i - 1];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int LS, RS;
            if (i == 0) {
                LS = 0;
            } else {
                LS = pf[i - 1];
            }
            RS = pf[n - 1] - pf[i];
            System.out.println("Left Sum =" + LS + ",Right Sum=" + RS);

            if (LS == RS) {
                count++;
                System.out.println("Equilibrium found at index " + count);

            } else {
                System.out.println("no equilibrium found at index" + i);
            }
        }

    }
}