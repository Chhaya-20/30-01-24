import java.util.*;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elem ");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Enter element ");
        int x = sc.nextInt();
        sc.close();
        int s = -1, e = -1;
        // for (int i = 0; i < n; i++) {
        // if ((a[i] == x)) {
        // System.out.println("hello");
        // s = i;

        // } else if (a[i] == x) {
        // System.out.println("byy");
        // e = i;
        // } else {
        // break;
        // }
        // }
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                s = i;
                break;
            }
        }
        for (int i = (n - 1); i >= 0; i--) {
            if (a[i] == x) {
                e = i;
                break;
            }

        }
        System.out.println("Starting index " + s);
        System.out.println("Ending index " + e);
    }

}
