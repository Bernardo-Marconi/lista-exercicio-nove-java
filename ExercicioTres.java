import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class ExercicioTres {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Informe o nome:");
            String nome = scanner.nextLine();

            System.out.println("Informe a idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o CPF:");
            String cpf = scanner.nextLine();

            System.out.println("Escolha o destino da viagem:");
            System.out.println("1. São Paulo");
            System.out.println("2. Nova York");
            System.out.println("3. Berlim");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            String destino;
            double valor;
            
            if (escolha == 1) {
                destino = "São Paulo";
                valor = 250;
            } else if (escolha == 2) {
                destino = "Nova York";
                valor = 2400;
            } else if (escolha == 3) {
                destino = "Berlim";
                valor = 3800;
            } else {
                System.out.println("Opção inválida. Encerrando o programa.");
                scanner.close();
                return;
            }

            int numeroPoltrona = random.nextInt(20) + 1;

            FileWriter arquivo = new FileWriter("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\exercicio tres.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);

            gravarArquivo.write("Recibo de Viagem");
            gravarArquivo.write("\n-----------------");
            gravarArquivo.write("\nNome: " + nome);
            gravarArquivo.write("\nIdade: " + idade);
            gravarArquivo.write("\nCPF: " + cpf);
            gravarArquivo.write("\nDestino: " + destino);
            gravarArquivo.write("\nValor a ser pago: R$" + valor);
            gravarArquivo.write("\nNúmero da poltrona: "+ numeroPoltrona);

            arquivo.close();
            scanner.close();

            System.out.println("O recibo de viagem foi gerado e salvo com sucesso! ");

        } catch (Exception e) {
            System.out.println("Algo deu errado!" + e);
        }
    }
}