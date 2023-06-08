import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExercicioUm {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            String[] nomeAluno = new String[5];
            int[] notaAluno = new int[5];

            for (int contadorNome = 0; contadorNome < 5; contadorNome++) {
                System.out.printf("Informe o nome do %d° aluno:\n", contadorNome + 1);
                nomeAluno[contadorNome] = scanner.nextLine();
            
                System.out.printf("Informe a nota final do %d° aluno:\n", contadorNome + 1);
                notaAluno[contadorNome] = scanner.nextInt();
                scanner.nextLine();
            }

            FileWriter arquivo = new FileWriter("C:\\Users\\berna\\OneDrive\\Área de Trabalho\\ExercicioUm.txt");
            PrintWriter gravarArqNomeNotaAluno = new PrintWriter(arquivo);

            for (int i = 0; i < 5; i++) {
                gravarArqNomeNotaAluno.write(i + 1 + "° Aluno: " + nomeAluno[i] + " | Nota: " + notaAluno[i] + "\n");
            }

            arquivo.close();
            scanner.close();

            System.out.println("Os nomes e notas dos alunos foram salvos com sucesso!");

        } catch (Exception e) {
            System.out.println("Algo deu errado!" + e);
        }
    }
}
