public class Carrossel extends Brinquedos{
    public static boolean regraCarrossel (int idade, double altura) {
        if (idade > 6 && altura > 1.30) {
            System.out.println("Pode participar do carrossel");
            return true;
        }
        else {
            System.out.println("Não pode andar na carrossel");
            return false;
        }
    }
}
