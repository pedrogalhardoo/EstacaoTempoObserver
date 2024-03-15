import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Subject {
    private List<Observer> observers;
    private double temperatura;
    private double umidade;
    private double velocidadeVento;

    public CentralEstacaoTempo() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, velocidadeVento);
        }
    }

    public void setMeasurements(double temperatura, double umidade, double velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }
}
