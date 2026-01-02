package pattern.behavioral.chainOfResponsibility;

class AuthPasswordHandler extends AuthHandler {
    @Override
    public boolean handle(AuthRequest request) {
        System.out.println("Проверка логина и пароля...");

        if (isValidCredentials(request.getUsername(), request.getPassword())) {
            System.out.println("Авторизация по паролю успешна");
            return true;
        }

        System.out.println("Неверные учетные данные");
        return false;
    }

    private boolean isValidCredentials(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
}
