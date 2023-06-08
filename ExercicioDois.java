import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExercicioDois {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            String[] itens = new String[10];
            double[] valores = new double[10];

            for (int i = 0; i < 10; i++) {
                System.out.printf("Informe o nome do %dº item:\n", i + 1);
                itens[i] = scanner.nextLine();

                System.out.printf("Informe o valor do %dº item:\n", i + 1);
                valores[i] = scanner.nextDouble();
                scanner.nextLine();
            }

            FileWriter arquivo = new FileWriter("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\exercicio dois.txt");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);

            for (int i = 0; i < 10; i++) {
                gravarArquivo.write("Item: " + itens[i] + " | Valor: R$" + valores[i]);
            }

            arquivo.close();
            scanner.close();

            System.out.println("Os itens de compra foram salvos no arquivo itens_supermercado.txt.");

        } catch (Exception e) {
            System.out.println("Algo deu errado!" + e);
        }
    }
}
