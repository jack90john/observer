package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Description:
 * Designer: jack
 * Date: 2017/8/7
 * Version: 1.0.0
 */
public class PositionAndStrategy implements Subject{

    private ArrayList<Observer> observers;
    private String strategy;
    private String position;

    public PositionAndStrategy() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers = this.observers.stream()
                .filter(observer1 -> !observer1.equals(observer))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void notifyObservers() {
        this.observers = this.observers.stream()
                .peek(observer -> observer.update(position, strategy))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void setStrategy(String position, String strategy) {
        this.strategy = strategy;
        this.position = position;
        notifyObservers();
    }
}
