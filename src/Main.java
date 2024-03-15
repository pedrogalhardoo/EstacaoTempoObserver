public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.addObserver(prefeitura);
        cet.addObserver(aeroporto);

        cet.setMeasurements(30, 15, 55); 
        cet.setMeasurements(30, 25, 45); 
    }
}
