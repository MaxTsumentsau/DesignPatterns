package pattern.strategy;

public class NavigatorRunner {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute("дом", "работа");

        navigator.setStrategy(new DrivingStrategy());
        navigator.buildRoute("дом", "работа");
    }
}
