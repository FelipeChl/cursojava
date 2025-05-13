import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        Double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.printf("Você seu nome é %s e sua idade é %d, seu salario é %.2f", x, y, z);

        sc.close();
    }
}