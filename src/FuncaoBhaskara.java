import java.util.Scanner;

public class FuncaoBhaskara {
    public static void main(String[] args) throws Exception {

        int a,b ,c;
        double delta,x1,x2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para a, b e c: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        delta =Math.pow(b, 2) - 4*a*c;
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        if (delta < 0 ){
            System.out.println("Não existe resultado com delta sendo negativo");
        }
        else {
        System.out.println("O valor de x1 é " + x1 + " e o valor de x2 é " + x2);
        }
        scanner.close();

    }
}
