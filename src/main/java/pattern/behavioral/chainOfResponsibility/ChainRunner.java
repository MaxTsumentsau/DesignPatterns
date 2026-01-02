package pattern.behavioral.chainOfResponsibility;

public class ChainRunner {
    public static void main(String[] args) {
        AuthHandler chain = new IPFilterHandler();
        chain.setNext(new TokenAuthHandler())
                .setNext(new AuthPasswordHandler());

        System.out.println("=== Тест 1: Блокировка по IP ===");
        AuthRequest request1 = new AuthRequest("admin", "password", "valid_token", "192.168.1.100");
        boolean result1 = chain.handle(request1);
        System.out.println("Результат: " + (result1 ? "УСПЕХ" : "ОШИБКА"));

        System.out.println("\n=== Тест 2: Авторизация по токену ===");
        AuthRequest request2 = new AuthRequest("user", "wrong", "valid_token123", "192.168.1.101");
        boolean result2 = chain.handle(request2);
        System.out.println("Результат: " + (result2 ? "УСПЕХ" : "ОШИБКА"));

        System.out.println("\n=== Тест 3: Авторизация по паролю ===");
        AuthRequest request3 = new AuthRequest("admin", "password", "", "192.168.1.101");
        boolean result3 = chain.handle(request3);
        System.out.println("Результат: " + (result3 ? "УСПЕХ" : "ОШИБКА"));

        System.out.println("\n=== Тест 4: Полный провал ===");
        AuthRequest request4 = new AuthRequest("user", "wrong", "invalid", "192.168.1.101");
        boolean result4 = chain.handle(request4);
        System.out.println("Результат: " + (result4 ? "УСПЕХ" : "ОШИБКА"));
    }
}