public class AeroportoUberlandia implements Observer {
    @Override
    public void update(double temperatura, double umidade, double velocidadeVento) {
        if (velocidadeVento > 50) {
            System.out.println("Aeroporto de Uberlândia: Alerta! Rajadas de vento fortes: " + velocidadeVento + "km/h");
        }
    }
}