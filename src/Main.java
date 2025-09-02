import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Personagem vilao = new Personagem("Romaduke", 500, 150, 200, 550, 10, "Hidra" );

        System.out.println("Olá jogador, bem vindo a Batalha Lendaria. \nPor favor, difite o nome do seu personagem: ");
        String nome = in.nextLine();

        Personagem heroi = new Personagem(nome, 124, 50, 200, 250, 5, "Mago" );

        System.out.println("------------------Estados do seu personagem--------------------");
        System.out.println("Nome: "     + heroi.nome);
        System.out.println("Vida: "     + heroi.vida);
        System.out.println("Classe: "   + heroi.classePersonagem);
        System.out.println("Altura: "   + heroi.altura);
        System.out.println("---------------------Estados do Monstro------------------------");
        System.out.println("Nome: "     + vilao.nome);
        System.out.println("Vida: "     + vilao.vida);
        System.out.println("Classe: "   + vilao.classePersonagem);
        System.out.println("Altura: "   + vilao.altura);

        heroi.atacar(vilao);
        vilao.atacar(heroi);

        System.out.println("Vida do " + vilao.nome + " depois do ataque " + vilao.vida);
        System.out.println("Vida do " + heroi.nome + " depois do ataque " + heroi.vida);

    }
}