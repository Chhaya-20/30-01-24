import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elem ");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        // vector<int> ans;
        Vector<Integer> ans = new Vector<Integer>();
        // Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Set<Integer> hm = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (hm.contains(a[i])) {
                ans.add(a[i]);

            } else {
                hm.add(a[i]);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
