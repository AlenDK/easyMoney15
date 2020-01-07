import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        System.out.println("Welcome");
        calcualte();

    }


    public static int calcualte() {
        int a, b, total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();


        return plus(a,b);
    }

    public static int plus(int a, int b) {
        int total;

        total = a + b;

        return total;
    }


}




