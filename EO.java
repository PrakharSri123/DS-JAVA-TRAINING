import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String output = (n%2 == 0) ? "even":"odd";
        System.out.println(output);

    }
}
