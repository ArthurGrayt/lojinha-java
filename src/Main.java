import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a loja!");
        System.out.println("Qual seu nome?");
        Scanner leitor = new Scanner(System.in);

        // Supondo que você tem uma classe Verificador com o método verificarNome
        // Se não tiver, essa parte do código não funcionará sem ela.
        // Apenas para exemplo, vou supor que ela existe ou simplificar.
        // Por agora, vamos ignorar a classe Verificador para focar no seu problema principal.

        // Se Verificador é uma classe sua, ela deve estar em um arquivo Verificador.java
        // public class Verificador {
        //     public boolean verificarNome(String nome) {
        //         return nome != null && nome.length() >= 2 && nome.length() <= 50;
        //     }
        // }
        // Se você não tem essa classe, pode substituir a lógica de validação do nome diretamente aqui,
        // ou criar a classe Verificador.

        Verificador verification = new Verificador(); // Certifique-se de que esta classe existe
        boolean nomeValido = false;
        String nome = "";

        while (!nomeValido) {
            System.out.println("Por favor, digite seu nome:");
            nome = leitor.nextLine();
            if (verification.verificarNome(nome)) {
                System.out.println(" Olá " + nome + "! Você foi registrado com sucesso!");
                nomeValido = true;
            } else {
                System.out.println("Nome Inválido! Seu nome deve ter entre 2 e 50 caracteres.");
            }
        }

        System.out.println("O que você gostaria de comprar, " + nome + "?");
        System.out.println("1 - Games");
        System.out.println("2 - Consoles");
        System.out.println("3 - Action Figures");
        System.out.println("4 - Roupas ");
        System.out.flush();

        Scanner in = new Scanner(System.in);
        String escolha = in.nextLine();

        String escolhaLowerCase = escolha.toLowerCase();
        int opcaoNumerica = -1; // Valor padrão para indicar que nenhuma opção válida foi encontrada

        // Bloco de validação de escolha
        if (escolhaLowerCase.contains("1") || escolhaLowerCase.contains("games")) {
            opcaoNumerica = 1;
        } else if (escolhaLowerCase.contains("2") || escolhaLowerCase.contains("consoles")) {
            opcaoNumerica = 2;
        } else if (escolhaLowerCase.contains("3") || escolhaLowerCase.contains("action figures")) {
            opcaoNumerica = 3;
        } else if (escolhaLowerCase.contains("4") || escolhaLowerCase.contains("roupas")) {
            opcaoNumerica = 4;
        } else {

            System.out.println("Não consegui entender sua escolha. Por favor, tente novamente digitando o número ou o nome do item.");
            System.exit(0);
        }

        switch (opcaoNumerica) {
            case 1:
                System.out.println("Games!? Ótima escolha !");
                break;
            case 2:
                System.out.println("Consoles ein! Perfeitos pra jogar!");
                break;
            case 3:
                System.out.println("Você escolheu Action Figures! Aumente sua coleção!");
                break;
            case 4:
                System.out.println("Vamos turbinar seu estilo com novas roupas!");
                break;

        }

        leitor.close();
        in.close();
    }
}