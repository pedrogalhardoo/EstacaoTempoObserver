public class PrefeituraUberlandia implements Observer {
    @Override
    public void update(double temperatura, double umidade, double velocidadeVento) {
        if (umidade < 20) {
            System.out.println("Prefeitura de Uberlândia: Alerta! Umidade relativa do ar muito baixa: " + umidade + "%");
        }
    }
}