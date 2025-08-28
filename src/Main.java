public class Main {
    public static void main(String[] args) {

        Personagem heroi = new Personagem("Meros", 124, 50, 200, 250, 5, "Mago" );
        Personagem vilao = new Personagem("Romaduke", 500, 150, 200, 550, 10, "Hidra" );

        System.out.println("----------------------Heroi------------------------");
        System.out.println(heroi.nome);
        System.out.println(heroi.vida);
        System.out.println(heroi.classePersonagem);
        System.out.println(heroi.altura);
        System.out.println("---------------------Monstro------------------------");
        System.out.println(vilao.nome);
        System.out.println(vilao.vida);
        System.out.println(vilao.classePersonagem);
        System.out.println(vilao.altura);

    }
}