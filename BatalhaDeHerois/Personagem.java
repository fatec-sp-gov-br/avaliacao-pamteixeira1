public class Personagem {
    private final String nome;
    private int vida;
    private final int ataque;
    private final int defesa;
    private boolean pocaoUtilizada;

     public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pocaoUtilizada = false;

     }
    
     public void atacar(Personagem inimigo) {
        int danoCalculado = this.ataque - inimigo.defesa;
        if (danoCalculado < 1) {
             danoCalculado = 1;
        }
        inimigo.receberDano(danoCalculado);
     }

     public void receberDano(int dano) {
        this.vida -= dano;

        if (this.vida<0) {
            this.vida = 0;    
        }
     }

     public void usarPocao(Pocao pocao) {
        if (!this.pocaoUtilizada) {
            this.vida += pocao.getCura();
            this.pocaoUtilizada = true;
            System.out.println(this.nome + " usa " + pocao.getNome());
        }
     }
     public boolean estaVivo() {
         return this.vida > 0;
     }
     public String getNome() {
        return this.nome;
     }
     public int getVida() {
        return this.vida;
     }
}
