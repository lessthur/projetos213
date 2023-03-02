import java.util.Scanner;
public class calculadora_cont {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //criando variáveis
        double n1;
        double n2;
        double result;
        char op;
        char op2 = 'S';

        System.out.println("Calculadora simples: ");

        System.out.println("Qual operação deseja fazer? ");
        op = in.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        n1 = in.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = in.nextDouble();

        while (op2 == 'S') {
            switch (op) {
                case '+': {
                    result = n1 + n2;
                    System.out.println("O resultado é: " + result);
                }
                break;

                case '-': {
                    result = n1 - n2;
                    System.out.println("O resultado é: " + result);
                }
                break;

                case '/': {
                    result = n1 / n2;
                    System.out.println("O resultado é: " + result);
                }
                break;

                case '*': {
                    result = n1 * n2;
                    System.out.println("O resultado é: " + result);
                }
                break;

                default:
                    System.out.println("Operação inválida");
                    break;
            }
            System.out.println("Digite S para continuar e N para terminar: ");
            op2 = in.next().charAt(0);

            while (op2 != 'N' && op2 != 'S') {
                System.out.println("INVÁLIDO");
                System.out.println("Digite S para continuar e N para terminar: ");
                op2 = in.next().charAt(0);
            }
            if(op2=='S') {
                System.out.println("Qual operação deseja fazer? ");
                op = in.next().charAt(0);

                System.out.println("Digite o primeiro número: ");
                n1 = in.nextDouble();

                System.out.println("Digite o segundo número: ");
                n2 = in.nextDouble();
            }

        }
        System.out.println("FIM DO PROGRAMA");

    }
}

