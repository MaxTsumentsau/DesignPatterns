package pattern.chainOfResponsibility;

class TokenAuthHandler extends AuthHandler {
    @Override
    public boolean handle(AuthRequest request) {
        if (request.getToken() != null && !request.getToken().isEmpty()) {
            System.out.println("Проверка токена...");

            if (isValidToken(request.getToken())) {
                System.out.println("Авторизация по токену успешна");
                return true;
            }
        }

        System.out.println("Токен не предоставлен или невалиден, передаем дальше...");
        return handleNext(request);
    }

    private boolean isValidToken(String token) {
        return token.startsWith("valid_");
    }
}
