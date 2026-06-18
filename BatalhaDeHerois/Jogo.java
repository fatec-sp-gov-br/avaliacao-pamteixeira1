public class Jogo {
   public static void main(String[] args) {
    System.out.println("=== BATALHA INICIADA ===\n");

    Personagem artemis = new Personagem("Artemis", 30, 12, 4);
    Personagem goblin = new Personagem("Goblin", 20, 8, 2);

    Pocao pocaoPequena = new Pocao("Poção Pequena", 10);

    boolean goblinUsouPocaoNoTurno = false;

    while (artemis.estaVivo() && goblin.estaVivo()) {

         // Turno do Artemis
         artemis.atacar(goblin);
         System.out.println(artemis.getNome() + " ataca " + goblin.getNome());
         System.out.println(goblin.getNome() + " possui " + goblin.getVida() + " de vida\n");

         if (!goblin.estaVivo()) {
            break;
         }
         // Turno do Goblin
         goblin.atacar(artemis);
         System.out.println(goblin.getNome() + " ataca " + artemis.getNome());
         System.out.println(artemis.getNome() + " possui " + artemis.getVida() + " de vida\n");

         if (!artemis.estaVivo()) {
            break;
         }

         if (goblin.getVida() <= 10 && !goblinUsouPocaoNoTurno) {
            goblin.usarPocao(pocaoPequena);
            System.out.println(goblin.getNome() + " possui " + goblin.getVida() + " de vida\n");
            goblinUsouPocaoNoTurno = true;

            goblin.usarPocao(pocaoPequena);
         }
    }
    System.out.println("=== FIM DA BATALHA ===");

    if (artemis.estaVivo()) {
        System.out.println("Vencedor: " + artemis.getNome());
    } else {
         System.out.println("Vencedor: " + goblin.getNome());
    }
   }
}
