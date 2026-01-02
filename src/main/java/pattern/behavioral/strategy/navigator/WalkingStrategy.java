package pattern.behavioral.strategy.navigator;

class WalkingStrategy implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Пеший маршрут из " + from + " в " + to);
    }
}
