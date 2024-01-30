import java.util.*;

public class Occurence {
    public static void main(String ags[]) {
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
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                c++;

            } else if (a[i] > x) {
                break;
            }
        }
        sc.close();
        System.out.println("Occurence is " + c);
    }
}