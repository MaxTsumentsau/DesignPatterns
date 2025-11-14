package pattern.strategy;

class DrivingStrategy implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Автомобильный маршрут из " + from + " в " + to);
    }
}
