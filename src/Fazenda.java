import java.util.Scanner;
public class Fazenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Bem-Vindo ao Fazenda Ednaldo Paes ---");
        System.out.println("Escolha um animal para visitar:\n1 - Cachorro \n2 - Vaca \n3 - Gato \n4 - Sair");
        int escolha = scanner.nextInt();
        Animal AnimalSelecionado = null;


        if (escolha == 1) {
            AnimalSelecionado = new Cachorro();
        } else if (escolha == 2) {
            AnimalSelecionado = new Vaca();
        } else if (escolha == 3) {
            AnimalSelecionado = new Gato();
        } else if (escolha == 4) {
            System.out.println("saindo");
            scanner.close();
            return;

        }

        AnimalSelecionado.visitar();
    }

}
