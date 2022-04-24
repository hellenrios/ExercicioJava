public class ParqueDiversao {
    private static boolean regraMontanha;
    private static boolean regraCarrossel;
    private static boolean regraRoda;

    public static void main(String args[]) {
        Brinquedos brinquedos = new Brinquedos();
        MontanhaRussa.regraMontanha(18, 1.70);
        Carrossel.regraCarrossel(5, 1.10);
        RodaGigante.regraRoda(1, 0.70);

    }

}