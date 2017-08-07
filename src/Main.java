import observer.Strategy;
import subject.PositionAndStrategy;

public class Main {
    public static void main(String[] args) {
        PositionAndStrategy striker = new PositionAndStrategy();
        PositionAndStrategy defender = new PositionAndStrategy();
        Strategy strategy = new Strategy();
        strategy.registerObserver(striker);
        strategy.registerObserver(defender);
        striker.setStrategy("前锋", "进攻");
        defender.setStrategy("后卫", "防守");

        strategy.removeObserver(defender);
        striker.setStrategy("前锋", "进攻");
        defender.setStrategy("后卫", "防守");

    }
}
