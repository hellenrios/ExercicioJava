public class MontanhaRussa  extends Brinquedos {
    public static boolean regraMontanha(int idade, double altura) {
        if (idade > 16 && altura > 1.55) {
            System.out.println("Pode participar da montanha russa");
            return true;
        }
        else {
            System.out.println("Não pode andar na Montanha Russa");
            return false;
        }
    }
}
