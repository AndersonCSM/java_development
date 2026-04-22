import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Extrato extrato = new Extrato();
        //extrato.visualizar();
        int opc = 0;
        float valor;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Visualizar Extrato");
            System.out.println("4 - Finalizar");
            opc = input.nextInt();

            switch (opc) {
                case 1: {
                    System.out.println("Valor do deposito: ");
                    valor = input.nextFloat();
                    extrato.transacao(valor);
                    break;
                }
                case 2: {
                    System.out.println("Valor do saque: ");
                    valor = input.nextFloat();
                    extrato.transacao(-valor);
                    break;
                }
                case 3: {
                    System.out.println("Transações: ");
                    extrato.visualizar();
                    break;
                }
                case 4:{
                    System.out.println("Finalizando programa");
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (opc != 4);

        input.close();
    }
}
