import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int id, idade;
        String nome, telefone = "";
        

        do {
            System.out.println("Informe o id: ");
            id = input.nextInt();
            if (id < 0){
                break;
            }

            Cliente template = new Cliente();
            template.setId(id);
            
            // consumir o \n
            input.nextLine();

            System.out.println("Informe o nome: ");
            nome = input.nextLine();
            template.setNome(nome);

            System.out.println("Informe a idade: ");
            idade = input.nextInt();
            template.setIdade(idade);

            // consumir o \n
            input.nextLine();
            
            System.out.println("Informe o Telefone: ");
            telefone = input.nextLine();
            template.setTelefone(telefone);

            clientes.add(template);
            System.out.println("Cliente adicionado!");
        } while (id >= 0);

        for (Cliente c: clientes){
            System.out.println(c);
        }

        input.close();

    }
}
