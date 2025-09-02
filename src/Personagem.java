public class Personagem {
    String nome;
    int idade;
    int forca;
    int defesa;
    int vida;
    double altura;
    String classePersonagem;

    public Personagem () {

    }

    public Personagem (String nome, int idade, int forca, int defesa, int vida, double altura, String classPersonagem) {
        this.nome = nome;
        this.idade = idade;
        this.forca = forca;
        this.defesa = defesa;
        this.vida = vida;
        this.altura = altura;
        this.classePersonagem = classPersonagem;
    }

    public void atacar (Personagem alvo) {
        int dano = (alvo.defesa - this.forca) / 2  ;

        if (dano <= 0) {
            dano = 0;
        }

        System.out.println(this.nome + " atacou " + alvo.nome + " e deu " + dano + " de dano.");
        System.out.println(dano);

        if (alvo.vida < 0) {
            alvo.vida = 0;
        } else {
            alvo.vida -= dano;
        }
    }

    public void defender () {

    }

    public void esquivar () {

    }

    public void correr () {

    }

}
