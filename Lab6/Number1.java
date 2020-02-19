Package Lab6
import java.util.*;
class Number1 {
    public static void main(String args[]) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println("Entered integers are-");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum of the integers is: " + sum);
        sc.close();
    }
}