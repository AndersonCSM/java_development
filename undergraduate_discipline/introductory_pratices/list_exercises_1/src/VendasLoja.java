import java.util.Scanner;

public class VendasLoja {
    public static void main(String[] args) {
        int codigo = 0, produtoValor = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do setor");
        codigo = input.nextInt();
        System.out.println("Informe o preço do produto");
        produtoValor = input.nextInt();

        if (produtoValor <= 0) {
            System.out.println("Valor inválido");
        } else {
            switch (codigo) {
                case 111: {
                    if (produtoValor < 50) {
                        System.out.printf("""
                                Setor de Cama, mesa e banho
                                Valor com desconto: R$ %.2f
                                """, (produtoValor * 0.9));
                    } else if ((50 <= produtoValor) && (produtoValor <= 100)) {
                        System.out.printf("""
                                Setor de Cama, mesa e banho
                                Valor com desconto: R$ %.2f
                                """, (produtoValor * 0.8));
                    } else {
                        System.out.printf("""
                                Setor de Cama, mesa e banho
                                Valor com desconto: R$ %.2f
                                """, (produtoValor * 0.6));
                    }
                    break;
                }
                case 222: {
                    if (produtoValor > 500) {
                        System.out.printf("""
                                Setor de Eletrônicos
                                Valor com desconto: R$ %.2f
                                """, (produtoValor * 0.9));
                    } else {
                        System.out.printf("""
                                Setor de Eletrônicos
                                Valor com desconto: R$ %.2f
                                """, (float) produtoValor);
                    }
                    break;
                }
                default: {
                    System.out.println("Setor Invalido.");
                }
            }
        }

        input.close();
    }
}
